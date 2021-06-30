package com.example.masini2

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.masini2.databinding.ActivityMainBinding
import com.example.masini2.databinding.ContactBinding
import java.net.Socket

class Contact:AppCompatActivity() {
    private lateinit var binding: ContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener{

        }

    }

}