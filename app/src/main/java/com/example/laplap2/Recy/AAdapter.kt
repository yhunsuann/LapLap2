package com.example.laplap2.Recy

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AAdapter(
    private val listMusics:List<Music>
)  : RecyclerView.Adapter<ViewHolderr>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolderr.from(parent)

    override fun onBindViewHolder(holder: ViewHolderr, position: Int) {
        holder.bind(listMusics[position])
        }

    override fun getItemCount()  = listMusics.size
}