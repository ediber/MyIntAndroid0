package com.e.myintandroid0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// Lesson topics
// Views: Button, EditText, textView
// ClickEvent
// move to another activity
// activity lifeCycle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.button0)

        val edit0 = findViewById<EditText>(R.id.editText0)

        val txtView0 = findViewById<TextView>(R.id.textView0)

        val txtView1 = findViewById<View>(R.id.textView1)


        // event that will happen when button is clicked
        btn0.setOnClickListener(View.OnClickListener {
            var str = edit0.text.toString()
            Log.d("Tag_click0", "clicked $str")

            // add String inside txtView0
            txtView0.text = str
        })

        // exercise 0
        // import project
        // add one more button with click event

        // exercize 1
        // add ediText and print it's value on button click
        // bonus add textView, write inside hte textView the value of ediText on button click

        // note: enter Ctrl + Space for autocomplete
        txtView1.setOnClickListener(View.OnClickListener {
            txtView0.text = edit0.text.toString()
        })

        // move to new activity

        findViewById<View>(R.id.button_next_activity).setOnClickListener(View.OnClickListener {
            // happen on click event

            // move to activity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })


    }
}