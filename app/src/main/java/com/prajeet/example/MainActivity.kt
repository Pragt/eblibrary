package com.prajeet.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.prajeet.eblibrary.EbAlert

class MainActivity : AppCompatActivity() {

    private val ebAlert: EbAlert by lazy {
        EbAlert(this@MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showEbAlert(v: View) {
        ebAlert.showAlert(msg = "Hello All")
    }
}