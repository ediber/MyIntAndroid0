package com.e.myintandroid0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.button0)

        btn0.setOnClickListener(View.OnClickListener {
            Log.d("Tag_click0", "clicked")
        })

    }
}