package com.example.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.jetpack.adapter.FragmentAdapter
import com.example.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)

        setViewPager()
//        setDrawerToggle()
    }

    private fun setViewPager() {
        binding.viewPager2.adapter = FragmentAdapter(this)
    }

//    private fun setDrawerToggle() {
//       toggle = ActionBarDrawerToggle(this, binding.toolBar as DrawerLayout, R.string.drawer_open, R.string.drawer_close)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        toggle.syncState()
//    }
}