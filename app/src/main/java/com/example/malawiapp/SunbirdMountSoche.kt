package com.example.malawiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sunbird_mount_soche.*

class SunbirdMountSoche : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunbird_mount_soche)
        btn = findViewById(R.id.appBtn)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bing.com/search?q=best+hotels+in+malawi&cvid=5f8e5dde9c7848c8a664436d29ce66c8&aqs=edge.0.69i59j69i57j69i59l2j0l2j69i61l3.3935j0j1&pglt=2083&FORM=ANNTA1&PC=W069"))
            startActivity(intent)
        }
        btn2 = findViewById(R.id.btnApp)
        btn2.setOnClickListener {
            val next = Intent(this@SunbirdMountSoche,HotelBookingActivity::class.java)
            startActivity(next)
        }
    }
}