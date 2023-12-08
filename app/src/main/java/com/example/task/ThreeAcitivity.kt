package com.example.task

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Timer

class ThreeActivity : AppCompatActivity() {
    private lateinit var txTimer: TextView
    private lateinit var timer: CountDownTimer
    private lateinit var btNext: Button
    private var flag: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        txTimer = findViewById(R.id.txTimer)
        btNext = findViewById(R.id.btNext)
        btNext.setOnClickListener {
            val intent = Intent(this@ThreeActivity, GameActivity::class.java)
            startActivity(intent)
            flag = true
        }
        timer = object : CountDownTimer(1_0000, 50) {
            override fun onTick(remaining: Long) {
                val minutes = (remaining / 1000) / 60
                val seconds = (remaining / 1000) % 60
                txTimer.text = String.format("%02d:%02d", minutes, seconds)
            }

            override fun onFinish() {
                txTimer.text = "DONE!"
                if (!flag) {
                    val intent = Intent(this@ThreeActivity, GameActivity::class.java)
                    startActivity(intent)
                } else {
                    timer.cancel()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        timer.start()
    }

    override fun onStop() {
        super.onStop()
        timer.cancel()

    }

}