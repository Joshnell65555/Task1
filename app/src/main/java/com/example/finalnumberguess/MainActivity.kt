package com.example.finalnumberguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewDisplay = findViewById<TextView>(R.id.textView)

        val enterYourNumber = findViewById<EditText>(R.id.guessTheNumber)

        val buttonClickMe = findViewById<Button>(R.id.guessButton)

        val randomNumber = Random.nextInt(1, 100)

        val guesses = 5

        var count = 0




        buttonClickMe.setOnClickListener {

            count++

            var greetings: String
            var userGuess = enterYourNumber.text.toString().toInt()
            if (userGuess == randomNumber) {
                textViewDisplay.text = "Congratulations you guessed correct ${enterYourNumber.text}!"

            } else {
                if (userGuess < randomNumber) {
                    textViewDisplay.text = "Your number is too low ${enterYourNumber.text}!"

                } else {
                    (userGuess > randomNumber)
                    textViewDisplay.text = "Your number is too high ${enterYourNumber.text}!"

                   if (count > guesses) {
                        greetings = "you lose"



                        textViewDisplay.text = greetings
            }
        }
            }


        }
    }
}

