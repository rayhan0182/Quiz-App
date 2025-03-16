package com.rayhan.kotlinquiz.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rayhan.kotlinquiz.R
import com.rayhan.kotlinquiz.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitbtn.setOnClickListener {

            Nextquestion()

        }






    }

    private fun Nextquestion() {




    }
}