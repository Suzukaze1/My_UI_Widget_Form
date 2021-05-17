package com.alvinmd.mycomponentwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgButton = findViewById<ImageButton>(R.id.img_button_add)
        imgButton.setOnClickListener {
            Toast.makeText(this, R.string.success, Toast.LENGTH_LONG).show()
        }
    }
}