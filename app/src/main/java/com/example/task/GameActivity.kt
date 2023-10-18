package com.example.task

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    private var selectedCity: TextView? = null
    private var selectedClock: ImageView? = null
    private var isCitySelected = false
    private var isClockSelected = false

    private var selectedCity2: TextView? = null
    private var selectedClock2: ImageView? = null
    private var isCitySelected2 = false
    private var isClockSelected2 = false

    private var selectedCity3: TextView? = null
    private var selectedClock3: ImageView? = null
    private var isCitySelect3 = false
    private var isClockSelected3 = false

    private var selectedCity4: TextView? = null
    private var selectedClock4: ImageView? = null
    private var isCitySelect4 = false
    private var isClockSelect4 = false

    private var selectedCity5: TextView? = null
    private var selectedClock5: ImageView? = null
    private var isCitySelect5 = false
    private var isClockSelect5 = false

    private var selectedCity6: TextView? = null
    private var selectedClock6: ImageView? = null
    private var isCitySelect6 = false
    private var isClockSelect6 = false
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        selectedCity = findViewById(R.id.txMoscow)
        selectedCity2 = findViewById(R.id.txSidney)
        selectedCity3 = findViewById(R.id.txGamburg)
        selectedCity4 = findViewById(R.id.txLA)
        selectedCity5 = findViewById(R.id.txNY)
        selectedCity6 = findViewById(R.id.txSochi)

        selectedClock = findViewById(R.id.imMoscow)
        selectedClock2 = findViewById(R.id.imSidney)
        selectedClock3 = findViewById(R.id.imHamburg)
        selectedClock4 = findViewById(R.id.imSochi)
        selectedClock5 = findViewById(R.id.imNY)
        selectedClock6 = findViewById(R.id.imLA)


        selectedCity?.setOnClickListener {
            handleCityClick(selectedCity!!)
        }

        selectedClock?.setOnClickListener {
            handleClockClick(selectedClock!!)
        }

        selectedCity2?.setOnClickListener {
            handleCityClick(selectedCity2!!)
        }

        selectedClock2?.setOnClickListener {
            handleClockClick(selectedClock2!!)
        }
        selectedClock3?.setOnClickListener {
            handleClockClick(selectedClock3!!)
        }
        selectedCity3?.setOnClickListener {
            handleCityClick(selectedCity3!!)
        }
        selectedCity4?.setOnClickListener {
            handleClockClick(selectedClock4!!)
        }
        selectedClock4?.setOnClickListener {
            handleClockClick(selectedClock4!!)
        }
        selectedCity5?.setOnClickListener {
            handleClockClick(selectedClock5!!)
        }
        selectedClock5?.setOnClickListener {
            handleClockClick(selectedClock5!!)
        }
        selectedCity6?.setOnClickListener {
            handleClockClick(selectedClock6!!)
        }
        selectedClock6?.setOnClickListener {
            handleClockClick(selectedClock6!!)
        }
    }

    private fun handleClockClick(clock: ImageView) {
        if (clock == selectedClock) {
            isClockSelected = true
        } else if (clock == selectedClock2) {
            isClockSelected2 = true
        } else if (clock == selectedClock3) {
            isClockSelected3 = true
        }
        clock.isSelected = true

        if ((isCitySelected && isClockSelected) || (isCitySelected2 && isClockSelected2) || (isCitySelect3 && isClockSelected3)) {
            checkAnswer()
        }
    }

    private fun handleCityClick(city: TextView) {
        when (city) {
            selectedCity -> {
                isCitySelected = true
            }

            selectedCity2 -> {
                isCitySelected2 = true
            }

            selectedCity3 -> {
                isCitySelect3 = true
            }

            selectedCity4 -> {
                isCitySelect4 = true
            }

            selectedCity5 -> {
                isCitySelect5 = true
            }

            selectedCity5 -> {
                isCitySelect4 = true
            }

            selectedCity6 -> {
                isCitySelect6 = true
            }
        }
        city.isSelected = true
    }

    private fun checkAnswer() {
        val correctImageId = R.id.imMoscow
        val correctTextId = R.id.txMoscow

        val selectedImageId = selectedClock?.id ?: 0
        val selectedTextId = selectedCity?.id ?: 0

        val correctImageId2 = R.id.imSidney
        val correctTextId2 = R.id.txSidney

        val selectedImageId2 = selectedClock2?.id ?: 0
        val selectedTextId2 = selectedCity2?.id ?: 0

        val correctImageId3 = R.id.imHamburg
        val correctTextId3 = R.id.txGamburg

        val selectedImageId3 = selectedClock3?.id ?: 0
        val selectedTextId3 = selectedCity3?.id ?: 0

        val selectedImageId4 = selectedClock4?.id ?: 0
        val selectedTextId4 = selectedCity4?.id ?: 0

        val correctImageId4 = R.id.imNY
        val correctTextId4 = R.id.txNY

        val selectedImageId5 = selectedClock5?.id ?: 0
        val selectedTextId5 = selectedCity5?.id ?: 0

        val correctImageId5 = R.id.imLA
        val correctTextId5 = R.id.txLA

        val selectedImageId6 = selectedClock6?.id ?: 0
        val selectedTextId6 = selectedCity6?.id ?: 0

        val correctImageId6 = R.id.imSochi
        val correctTextId6 = R.id.txSochi

        if ((selectedImageId == correctImageId && selectedTextId == correctTextId) ||
            (selectedImageId2 == correctImageId2 && selectedTextId2 == correctTextId2) ||
            (selectedImageId3 == correctImageId3 && selectedTextId3 == correctTextId3) ||
            (selectedImageId4 == correctImageId4 && selectedTextId4 == correctTextId4) ||
            (selectedImageId5 == correctImageId5 && selectedTextId5 == correctTextId5) ||
            (selectedImageId6 == correctImageId6 && selectedTextId6 == correctTextId6)
        ) {
            score++
            val txResult = findViewById<TextView>(R.id.txCount)
            txResult.text = "Score: $score"
        }
        if (score == 6) {
            val intent = Intent(this@GameActivity,finishActivity::class.java)
            startActivity(intent)

        }
        selectedClock?.isSelected = false
        selectedClock2?.isSelected = false
        selectedClock3?.isSelected = false
        selectedClock4?.isSelected = false
        selectedClock5?.isSelected = false
        selectedClock6?.isSelected = false
        selectedCity?.isSelected = false
        selectedCity2?.isSelected = false
        selectedCity3?.isSelected = false
        selectedCity4?.isSelected = false
        selectedCity5?.isSelected = false
        selectedCity6?.isSelected = false

        isClockSelected = false
        isClockSelected2 = false
        isCitySelected = false
        isCitySelected2 = false
        isCitySelect3 = false
        isClockSelected3 = false
        isCitySelect4 = false
        isClockSelect4 = false
        isCitySelect5 = false
        isClockSelect5 = false
        isCitySelect6 = false
        isClockSelect6 = false
    }

}
