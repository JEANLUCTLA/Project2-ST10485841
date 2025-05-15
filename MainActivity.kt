package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // giving id to the button and storing them in variables
        val btn_start = findViewById<Button>(R.id.startbtn)


        btn_start.setOnClickListener {
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)


        }
    }
}