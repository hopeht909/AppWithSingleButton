package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var bt: Button
    lateinit var tv: TextView
    lateinit var et: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt = findViewById(R.id.bt)
        tv = findViewById(R.id.tv)
        et = findViewById(R.id.et)

        bt.setOnClickListener {
            tv.text = et.text
        }
    }
}