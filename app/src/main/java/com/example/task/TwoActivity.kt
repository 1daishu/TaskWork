package com.example.task

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TwoActivity : AppCompatActivity() {
    private lateinit var btGoTimeActivity: Button
    private lateinit var btGoFourActivity: Button
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