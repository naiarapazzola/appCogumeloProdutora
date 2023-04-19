package com.example.cogumeloprodutora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.cogumeloprodutora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.botaoLogin
        edButton.setOnClickListener{
            val intent = Intent(this,sobrenos::class.java)
            startActivity(intent)
        }
    }
}