package com.example.multirepoclient1applocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.closet.utils.Greetings
import com.example.multirepoclient1applocal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.welcomeTextView.text = Greetings().getWelcomeMessage()
    }
}