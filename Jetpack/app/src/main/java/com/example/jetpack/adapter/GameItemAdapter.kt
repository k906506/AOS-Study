package com.example.jetpack.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack.data.Game
import com.example.jetpack.databinding.GameItemBinding

class GameItemAdapter(private val items: ArrayList<Game>) :
    RecyclerView.Adapter<GameItemAdapter.GameItemViewHolder>() {
    inner class GameItemViewHolder(private val binding: GameItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(game: Game) {
            binding.gameTitleTextView.text = game.title
            binding.gameContentTextView.text = game.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameItemViewHolder {
        return GameItemViewHolder(
            GameItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: GameItemViewHolder, position: Int) {
        return holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}