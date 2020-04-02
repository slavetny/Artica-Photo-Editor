package com.slavetny.articaeditor.domain.extension

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore

fun Activity.openGalleryForPickingImage(code: Int) {
    Intent(
        Intent.ACTION_PICK,
        MediaStore.Images.Media.EXTERNAL_CONTENT_URI
    ).apply {
        startActivityForResult(Intent.createChooser(this, "Select Photo"), code)
    }
}