package com.example.masini2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.masini2.databinding.MasiniBinding

class Masini :AppCompatActivity() {

    private lateinit var binding: MasiniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MasiniBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}