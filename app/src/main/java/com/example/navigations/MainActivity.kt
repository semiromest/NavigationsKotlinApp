package com.example.navigations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigations.databinding.ActivityMainBinding
import android.content.Intent


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener() {
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)}





    }
}