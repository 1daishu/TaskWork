package com.example.task

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TwoActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
    }
    fun onGoToThrirdActivityBt(view: View){
        val intent1 = Intent(this,ThreeActivity::class.java)
        startActivity(intent1)
    }
    fun onGoToFourthActivityBt(view: View){
        val intent1 = Intent(this,FourActivity::class.java)
        startActivity(intent1)
    }
}