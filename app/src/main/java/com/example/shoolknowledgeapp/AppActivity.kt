package com.example.shoolknowledgeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        val mathButton: Button = findViewById(R.id.math_button)
        val rusButton: Button = findViewById(R.id.rus_button)

        mathButton.setOnClickListener {
            startActivity(Intent(this, MathActivity().javaClass))
        }
    }
}