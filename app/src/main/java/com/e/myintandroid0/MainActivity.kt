package com.e.myintandroid0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.button0)

        val edit0 = findViewById<EditText>(R.id.editText0)

        // event that will happen when button is clicked
        btn0.setOnClickListener(View.OnClickListener {
            var txt = edit0.text.toString()
            Log.d("Tag_click0", "clicked $txt")
        })

        // exercise 0
        // import project
        // add one more button with click event

    }
}