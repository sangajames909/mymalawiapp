package com.example.malawiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VacationActivity : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacation)
        btn = findViewById(R.id.buttonNext)
        btn.setOnClickListener {
            val  intent = Intent(this@VacationActivity,SunbirdMountSoche::class.java)
            startActivity(intent)
        }
    }
}