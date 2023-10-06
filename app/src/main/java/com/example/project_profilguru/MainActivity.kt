package com.example.project_profilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)

        button.setOnClickListener{
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)
        }

        button2.setOnClickListener{
            val Intent =Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}