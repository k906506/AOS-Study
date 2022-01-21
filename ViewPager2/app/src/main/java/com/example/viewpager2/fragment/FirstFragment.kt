package com.example.viewpager2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.adapter.FirstFragmentAdapter
import com.example.viewpager2.data.Item
import com.example.viewpager2.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragmentBinding.inflate(inflater, container, false)

        setViewPager()
        return binding.root
    }

    private fun setViewPager() {
        var items = ArrayList<Item>()

        for (i in 0 until 10) {
            items.add(Item(title = i.toString(), context = "${i}의 데이터"))
        }

        binding.viewPager2.adapter = FirstFragmentAdapter(items)
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

}