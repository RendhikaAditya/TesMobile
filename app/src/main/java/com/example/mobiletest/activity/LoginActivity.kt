package com.example.mobiletest.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiletest.MainActivity
import com.example.mobiletest.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        if (!binding.edEmail.text.toString().equals("")){
//            if (!binding.edEmail.text.toString().equals("")){
                binding.btnMasuk.setOnClickListener {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
//            }
//        }
    }
}