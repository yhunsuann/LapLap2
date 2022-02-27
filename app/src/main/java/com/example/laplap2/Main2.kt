package com.example.laplap2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laplap2.Recy.Music
import com.example.laplap2.databinding.ActivityMain2Binding
import com.example.laplap2.databinding.ItemBinding

class Main2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val song =binding.edt1.text.toString()
            val singer = binding.edt2.text.toString()
            val music = Music(song, singer)
            MainActivity.Musics.add(music)
            finish()
        }
    }
}