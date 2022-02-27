package com.example.laplap2.Recy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laplap2.databinding.ItemBinding
import java.util.function.BinaryOperator

class ViewHolderr private constructor(
    private val binding: ItemBinding
    ):RecyclerView.ViewHolder(binding.root)
{
    companion object{
        fun from(parent:ViewGroup):ViewHolderr{
            val binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
            return ViewHolderr(binding)

        }

    }
    fun bind(music: Music){
        binding.song.text = music.song
        binding.singer.text =music.singer

    }

}