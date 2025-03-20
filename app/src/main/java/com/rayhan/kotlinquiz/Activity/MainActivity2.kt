package com.rayhan.kotlinquiz.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.rayhan.kotlinquiz.Data.Localsourcedata
import com.rayhan.kotlinquiz.Data.viewmodel
import com.rayhan.kotlinquiz.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val viewmodel: viewmodel by viewModels()
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        currentquestion()



        binding.submitbtn.setOnClickListener {

            val selectIndex =
                binding.radiogroup.indexOfChild(findViewById(binding.radiogroup.checkedRadioButtonId))

            if (selectIndex != -1) {

                viewmodel.correctanser(selectIndex)

                Nextquestion()

            } else {

                Toast.makeText(this@MainActivity2,"please select any index",Toast.LENGTH_SHORT).show()


            }


        }


    }


    private fun Nextquestion() {

        if (viewmodel.nextquestion() != null) {

            currentquestion()

        } else {

            val intent = Intent(this@MainActivity2, ResultActivity::class.java)

            intent.putExtra("score", viewmodel.score)

            startActivity(intent)

        }


    }

    private fun currentquestion() {

        binding.apply {

            question.text = viewmodel.currentquestion().question

            op.text = viewmodel.currentquestion().option

            op2.text = viewmodel.currentquestion().option2

            op3.text = viewmodel.currentquestion().option3

            op4.text = viewmodel.currentquestion().option4

            binding.radiogroup.clearCheck()


        }

    }
}