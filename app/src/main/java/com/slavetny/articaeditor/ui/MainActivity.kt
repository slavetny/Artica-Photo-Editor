package com.slavetny.articaeditor.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.slavetny.articaeditor.EditorContract
import com.slavetny.articaeditor.R
import com.slavetny.articaeditor.domain.extension.openGalleryForPickingImage
import com.slavetny.articaeditor.ui.adapter.FilterAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.filter_list.*

class MainActivity : AppCompatActivity(), EditorContract.EditorView, View.OnClickListener {

    private val code: Int = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkPhoto()
        initRecyclerView()

        photoField.setOnClickListener(this)
    }

    private fun initRecyclerView() {
        var adapter = FilterAdapter()

        var linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
    }

    private fun checkPhoto() {
        if (photoField.drawable != null) {
            loadHint.visibility = View.GONE
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.photoField -> {
                openGalleryForPickingImage(code)
            }

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (data?.data != null) {
            photoField.setImageURI(data?.data)

            checkPhoto()
        }
    }
}
