package com.example.malawiapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class MusicFragment : Fragment() {
    lateinit var btn: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_music, container, false)
        btn = view.findViewById(R.id.btnMusic)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.malawi-music.com/"))
            startActivity(intent)
        }
        return view
    }

}