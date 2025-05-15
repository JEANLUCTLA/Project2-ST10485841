package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val sct_view = findViewById<TextView>(R.id.scoretv)
        val txt_view = findViewById<TextView>(R.id.qandatv)
        val rty_btn = findViewById<Button>(R.id.retrybtn)
        val ext_btn = findViewById<Button>(R.id.exitbtn)
        val feb_btn = findViewById<Button>(R.id.feedbackbtn)
        val the_score = intent.getIntExtra("score", 0)
        val the_total = intent.getIntExtra("total", 6)

        sct_view.text = "you scored:${the_score} out of ${the_total}"

        if (the_score >4){
            txt_view.text = "Well Done!!"
        }else{
            txt_view.text = "Try again"
        }


        val questions = listOf(
            "Apartheid in South Africa officially ended in 1994." ,
            "Nelson Mandela was imprisoned on Robben Island for over 30 years." ,
            "The Dutch were the first Europeans to settle in South Africa." ,
            "The Sharpeville Massacre happened in 1976." ,
            "South Africa became a Republic in 1961." ,
            "The Zulu Kingdom was founded by Shaka Zulu in the 19th century." ,


            )
        // The answers for all the questions
        val answers_list = listOf(
            true  ,
            false,
            true,
            false,
            true,
            true,


        )

        feb_btn.setOnClickListener {
            val textView = StringBuilder()
            for (i in questions.indices){
                textView.append("Question ${i + 1}: ${questions[i]}\n")
                textView.append("Correct answer: ${if (answers_list[i]) "True" else "False"}\n\n")
            }
            txt_view.text = textView.toString()
        }


        ext_btn.setOnClickListener {
            finishAffinity()
        }
        rty_btn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}