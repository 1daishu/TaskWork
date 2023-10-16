package com.example.task

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Timer

class ThreeActivity : AppCompatActivity() {
    private lateinit var textTimer: TextView
    private var countDownTimer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        textTimer= findViewById(R.id.txTimer)
        val initTimer: Long = 3000
        CreateAndStartTimer(initTimer)
    }

    private fun CreateAndStartTimer(initTimer: Long) {
        countDownTimer = object : CountDownTimer(initTimer, 1000) {
            override fun onTick(mlSecond: Long) {
                val second: Long = (mlSecond / 1000) % 60
                val minutes: Long = (mlSecond / 1000) / 60
                textTimer.text = String.format("%02d:%02d", minutes, second)
            }

            override fun onFinish() {
                val intent = Intent(this@ThreeActivity,GameActivity::class.java)
                startActivity(intent)
            }
        }
        countDownTimer?.start()
    }
    fun onGoToActivityGame(view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
    override fun onResume() {
        super.onResume()
        CreateAndStartTimer(3000);
    }

}