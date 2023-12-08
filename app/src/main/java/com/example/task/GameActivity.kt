package com.example.task

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    private lateinit var txCount: TextView
    private lateinit var imDubai: ImageView
    private lateinit var txDubai: TextView
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        txCount = findViewById(R.id.txCount)
        imDubai = findViewById(R.id.imDubai)
        txDubai = findViewById(R.id.txDubai)
        imDubai.setOnClickListener {

        }
        txDubai.setOnClickListener {

        }
    }
}
