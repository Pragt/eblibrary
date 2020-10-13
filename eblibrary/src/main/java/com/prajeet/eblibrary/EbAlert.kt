package com.prajeet.eblibrary

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast

/**
Created by Prajeet Naga on 10/13/20, 9:32 AM.
 **/

open class EbAlert(private val context: Context) {
    fun showAlert(title: String = "Ebpearls", msg: String = "") {
        var builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(msg)
        builder.setPositiveButton("Ok") { _, _ ->
        }
        var dialog = builder.create()
        dialog.show()
    }
    
    fun showToast(msg: String = "") {
       Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
