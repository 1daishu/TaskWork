package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btStart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btStart = findViewById(R.id.btPlay)
        btStart.setOnClickListener {
            val intentStart = Intent(this, TwoActivity::class.java)
            startActivity(intentStart)
        }
    }
}