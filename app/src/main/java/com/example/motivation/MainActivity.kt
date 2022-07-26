package com.example.motivation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Esconde barra de navegação
        supportActionBar?.hide()

        handleUserName()

        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            var a = 1
        }
    }

    private fun handleUserName() {
        val name = SecurityPreferences(this).getString("USER_NAME")
        binding.textUserName.text = "Olá,${name}!"
    }
}
