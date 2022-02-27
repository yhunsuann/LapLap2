package com.example.laplap2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laplap2.Recy.AAdapter
import com.example.laplap2.Recy.Music
import com.example.laplap2.databinding.ActivityMain2Binding
import com.example.laplap2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recy.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = AAdapter(Musics)
        }
        binding.add.setOnClickListener {
            val intent =Intent(this, Main2::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.recy.adapter = AAdapter(Musics)

    }
    companion object {
        val Musics = mutableListOf<Music>()
    }
}