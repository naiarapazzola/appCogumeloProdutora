package com.example.cogumeloprodutora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.cogumeloprodutora.databinding.ActivitySobrenosBinding


class sobrenos : AppCompatActivity() {
    private lateinit var binding: ActivitySobrenosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_sobrenos)
        binding = ActivitySobrenosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.botaoorcamento
        edButton.setOnClickListener{
            val intent = Intent(this,pagorcamento::class.java)
            startActivity(intent)
        }
    }
}