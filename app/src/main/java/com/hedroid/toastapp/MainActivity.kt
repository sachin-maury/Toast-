package com.hedroid.toastapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val toastButton= findViewById<Button>(R.id.btn_toast)

        toastButton.setOnClickListener{
             Toast.makeText(this,"Hi sachin ❤️",Toast.LENGTH_SHORT).show()
        }

    }
}