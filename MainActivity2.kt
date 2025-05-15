package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // giving id to the button and storing them in variables
        val btn_tru = findViewById<Button>(R.id.truebtn)
        val btn_fls = findViewById<Button>(R.id.falsebtn)
        val btn_nxt = findViewById<Button>(R.id.nextbtn)
        val txt_que = findViewById<TextView>(R.id.questiontv)
        val txt_ans = findViewById<TextView>(R.id.answertv)




        val questions = listOf(
            "Apartheid in South Africa officially ended in 1994." ,
            "Nelson Mandela was imprisoned on Robben Island for over 30 years." ,
            "The Dutch were the first Europeans to settle in South Africa." ,
            "The Sharpeville Massacre happened in 1976." ,
            "South Africa became a Republic in 1961." ,
            "The Zulu Kingdom was founded by Shaka Zulu in the 19th century."


            )
        // The answers for all the questions
        val answers_list = listOf(
            true  ,
            false,
            true,
            false,
            true,
            true


            )


        var score = 0
        var curent_index = 0

        txt_que.text = questions[curent_index]

        btn_tru.setOnClickListener {
            if(answers_list[curent_index] == true){
                score++

            }


        }
        btn_fls.setOnClickListener {
            if(answers_list[curent_index] == false){
                score++

            }
        }

        btn_nxt.setOnClickListener {
            curent_index++

            if(curent_index < questions.size){
                txt_que.text = questions[curent_index]
            }else{
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("score", score)
                intent.putExtra("total", 6)

                startActivity(intent)
            }

        }




    }
    }
