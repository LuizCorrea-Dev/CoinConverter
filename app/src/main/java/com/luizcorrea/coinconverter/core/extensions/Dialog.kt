package com.luizcorrea.coinconverter.core.extensions

import android.content.Context
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import com.luizcorrea.coinconverter.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

// dialog genérico com button Ok com listener
fun Context.createDialog(block: MaterialAlertDialogBuilder.() -> Unit = {}): AlertDialog {
    val builder = MaterialAlertDialogBuilder(this)
    builder.setPositiveButton(android.R.string.ok, null)
    block(builder)
    return builder.create()
}

// Loading
fun Context.createProgressDialog(): AlertDialog {
    return createDialog {
        val padding = this@createProgressDialog.resources.getDimensionPixelOffset(R.dimen.layout_padding)
        val progressBar = ProgressBar(this@createProgressDialog)
        progressBar.setPadding(padding, padding, padding, padding)
        setView(progressBar)

        setPositiveButton(null, null)
        setCancelable(false)
    }
}