package com.example.jetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jetpack.adapter.GameItemAdapter
import com.example.jetpack.data.Game
import com.example.jetpack.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(layoutInflater)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView() {
        var items = ArrayList<Game>()
        for (i in 1 until 10) {
            items.add(Game(title = "${i}번째 게임", content = "${i}번째 게임입니다."))
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = GameItemAdapter(items)
    }
}