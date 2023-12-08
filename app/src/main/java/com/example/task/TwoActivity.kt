package com.example.task

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class TwoActivity : AppCompatActivity() {
    private lateinit var btGoTimeActivity: Button
    private lateinit var btGoFourActivity: Button
    private lateinit var txTimer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        btGoTimeActivity = findViewById(R.id.btTime)
        btGoFourActivity = findViewById(R.id.btCasual)
        btGoTimeActivity.setOnClickListener {
            val intentGoPlatTime = Intent(this, ThreeActivity::class.java)
            startActivity(intentGoPlatTime)
        }
        btGoFourActivity.setOnClickListener {
            val intentGoFourActivity = Intent(this, FourActivity::class.java)
            startActivity(intentGoFourActivity)
        }
    }
}