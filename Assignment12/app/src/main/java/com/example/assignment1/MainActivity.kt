package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // i declared variables that would suit the components
        val person_age = findViewById<EditText>(R.id.editTextNumber)
        val clear_button = findViewById<Button>(R.id.button2)
        val history_button = findViewById<Button>(R.id.button)
        val answer = findViewById<TextView>(R.id.textView3)


        //when the generate history button is clicked the the output will be the users age and the person who died at the same age as the user
        history_button?.setOnClickListener {
            val age = person_age.text.toString().toInt() //i initialized another variable so that it makes it easier and quicker for me to code

            if (age < 20){   //if the user enter an age that is lower than 20 then an error message will pop up
                answer.text="Invalid age , enter another age" }

          else  if (age == 22) {
                answer.text = ": you are the same age as Charles IX Of France, he was a leader"
                    } else if
                                   (age == 95) {
                answer.text =
                            "${age} :you are the same age as Nelson Mandela , he was a former president for South Africa"
                    } else if
                                   (age == 52) {
                answer.text =
                            "${age}: You are the same age as William Shakespeare. William was a famous play-writer and poet"
                    } else if
                                   (age == 50) {
                answer.text =
                            "${age} : You are the same age as Rasputin,putin was known for his ability to heal the suffering which led to his introduction to the royal family "
                    } else if
                                   (age == 88) {
                answer.text =
                            "${age} :  You are the same age as Sir Charlie Chaplin. He was an historical film maker and actor"
                    } else if
                                   (age == 85) {
                answer.text =
                            "${age} : You are the same age as FW De Clerk. He was a historical fact in South Africa"
                    } else if
                                   (age == 39) { // if this age is equal too the age i declared then there will be an output of the person who died at the same age as the user
                answer.text =
                            "${age} : You are the same age as Malcolm X . He was a minister in the civil rights movement and a supporter of black nationalism"
                    } else if
                                   (age == 27) {
                answer.text = "${age} : You are the same age Kurt Cobain . He was a famous Writer"
                    } else if
                                   (age == 96) {
                answer.text =
                            "${age} : . You are the same age as Queen Elizabeth. She was known for being the Queen of the United Kingdom"
                    } else if
                                   (age == 36) {
                answer.text =
                            "${age}:  You are the same age as Princess Diana .Princess of Wales ,she was a member of the British Royal Family"

                    }
                else
                if (age > 100) { //if the user enter an age that is greater than 100 then an error message will pop up
                    answer.text = " invalid age enter another age "
                } else {
                    answer.text= "no history found " //if the user enters an age outside what i declared then no history will be found
                }



                    clear_button?.setOnClickListener { //when this button is click it will clear the text and the age
                        answer.text = ""
                        person_age.text.clear()
                    }
                }
            }
        }









