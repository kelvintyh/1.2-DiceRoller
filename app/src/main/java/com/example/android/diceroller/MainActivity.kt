package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener{ countUp()}


    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked",
        //Toast.LENGTH_SHORT ).show()

        /*  Three Dice
        val randomInt_1 = Random().nextInt(6) + 1
        val randomInt_2 = Random().nextInt(6) + 1
        val randomInt_3 = Random().nextInt(6) + 1

        val resultText_1: TextView = findViewById(R.id.result_text_1)
        val resultText_2: TextView = findViewById(R.id.result_text_2)
        val resultText_3: TextView = findViewById(R.id.result_text_3)
        resultText_1.text = randomInt_1.toString()
        resultText_2.text = randomInt_2.toString()
        resultText_3.text = randomInt_3.toString()
         */

        val randomInt = Random().nextInt(6) + 1
        val result : TextView = findViewById(R.id.result_text_4)
        result.text = randomInt.toString()
    }

    private fun countUp(){


        val resultText_1: TextView = findViewById(R.id.result_text_4)
        val resultText_2: TextView = findViewById(R.id.result_text_5)

        if(!resultText_1.text.equals("6")) {
            try {
                val x = resultText_1.text.toString().toInt() + 1;
                resultText_2.text = x.toString()

            } catch (nfe: NumberFormatException) {
                // not a valid int
            }
        }
    }
    }
