package com.example.viewpager2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2.data.Item
import com.example.viewpager2.databinding.FirstFragmentBinding
import com.example.viewpager2.databinding.ItemMainBinding
import com.google.android.material.internal.ContextUtils.getActivity

class FirstFragmentAdapter(private val items: ArrayList<Item>) :
    RecyclerView.Adapter<FirstFragmentAdapter.FirstFragmentViewHolder>() {
    inner class FirstFragmentViewHolder(private val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.textView.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstFragmentViewHolder {
        return FirstFragmentViewHolder(
            ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FirstFragmentViewHolder, position: Int) {
        return holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}