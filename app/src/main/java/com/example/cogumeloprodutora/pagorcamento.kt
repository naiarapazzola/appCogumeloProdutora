package com.example.cogumeloprodutora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.cogumeloprodutora.databinding.ActivityPagorcamentoBinding

class pagorcamento : AppCompatActivity() {
    private lateinit var binding: ActivityPagorcamentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_pagorcamento)
        binding = ActivityPagorcamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.bEnviar
        edButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}