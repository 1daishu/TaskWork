package com.example.task

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    private var txMoscow: TextView? = null
    private var imgMoscow: ImageView? = null
    private var counter: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        txMoscow = findViewById(R.id.txMoscow)
        imgMoscow = findViewById(R.id.imMoscow)

    }
}
