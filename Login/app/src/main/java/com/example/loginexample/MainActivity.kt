package com.example.loginexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickLoginButton()
    }

    private fun clickLoginButton() {
        binding.loginButton.setOnClickListener {
            when (checkTextView()) {
                true -> {
                    binding.emailTextView.text.clear()
                    binding.passwordTextView.text.clear()
                    Toast.makeText(this, "로그인에 성공하였습니다.", Toast.LENGTH_SHORT).show()
                }
                false -> {
                    Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun checkTextView(): Boolean {
        return !(binding.emailTextView.text.isEmpty() || binding.passwordTextView.text.isEmpty())
    }
}