package com.example.malawiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CultureActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture)
        textView = findViewById(R.id.blantyre)
        textView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malawitourism.com/regions/south-malawi/blantyre-limbe/"))
            startActivity(intent)
        }
        textView2 = findViewById(R.id.chintheche)
        textView2.setOnClickListener {
            val chi = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malawitourism.com/regions/north-malawi/chintheche/"))
            startActivity(chi)
        }
        textView3 = findViewById(R.id.landscape)
        textView3.setOnClickListener {
            val landscape = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malawitourism.com/experiences/landscape/"))
            startActivity(landscape)
        }
        textView4 = findViewById(R.id.museum)
        textView4.setOnClickListener {
            val museum = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malawitourism.com/experiences/culture/museums-historical-sites/"))
            startActivity(museum)
        }
    }
}