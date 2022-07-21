package com.example.motivation

import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUserBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(view: View?) {
        handleSave()
    }
    private fun handleSave() {
        val name = binding.editName.text.toString()
        if(name != " "){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }else {
            Toast.makeText(this,R.string.validation_mandatory_name,Toast.LENGTH_LONG).show()
        }
    }

}