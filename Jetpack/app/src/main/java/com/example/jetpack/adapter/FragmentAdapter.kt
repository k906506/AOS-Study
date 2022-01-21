package com.example.jetpack.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.jetpack.fragment.OneFragment
import com.example.jetpack.fragment.ThreeFragment
import com.example.jetpack.fragment.TwoFragment

class FragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments: List<Fragment> = listOf(OneFragment(), TwoFragment(), ThreeFragment())

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    override fun getItemCount(): Int {
        return fragments.size
    }
}