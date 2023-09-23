package com.example.task

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThreeActivity : AppCompatActivity() {
    private val delayMin: Long = 10000
    private lateinit var countdownTextView: TextView
    private lateinit var countDownTimer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        countdownTextView = findViewById(R.id.txTimer)
        val totalTimer: Int = 10000
        countDownTimer = object : CountDownTimer(totalTimer.toLong(), 1000) {
            override fun onTick(mill: Long) {
                val secondsRemaining = mill / 1000
                val minutes = secondsRemaining / 60
                val seconds = secondsRemaining % 60
                countdownTextView.text = String.format("Time:%02d:%02d second",minutes,seconds)
            }

            override fun onFinish() {
                countdownTextView.text = "Вперед!"
            }

        }
        countDownTimer.start()
        fun onDestroy() {
            super.onDestroy()
            countDownTimer.cancel()
        }

        val handler = Handler()
        var runnable = Runnable {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(runnable, delayMin)
    }

    fun onGoToActivityGame(view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}