package com.example.calculadora

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sumar.setOnClickListener {
            val numero1 = binding.numero1.text.toString()
            val numero2 = binding.numero2.text.toString()

            val res = numero1.toInt() + numero2.toInt()
            binding.resultado.text = res.toString()
        }

        binding.restar.setOnClickListener {
            val numero1 = binding.numero1.text.toString()
            val numero2 = binding.numero2.text.toString()

            val res = numero1.toInt() - numero2.toInt()
            binding.resultado.text = res.toString()
        }

        binding.multiplicar.setOnClickListener {
            val numero1 = binding.numero1.text.toString()
            val numero2 = binding.numero2.text.toString()

            val res = numero1.toInt() * numero2.toInt()
            binding.resultado.text = res.toString()
        }

        binding.dividir.setOnClickListener {
            val numero1 = binding.numero1.text.toString()
            val numero2 = binding.numero2.text.toString()

            val res = numero1.toInt() / numero2.toInt()
            binding.resultado.text = res.toString()
        }
    }
}