package com.example.sqlitedatabase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import com.example.sqlitedatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val prince = User(1,"Rayhan",31)

        val db = Room.databaseBuilder(

            applicationContext,

            basedata::class.java,

            "user_dao"
        ).allowMainThreadQueries().build()

        val ab = db.da()


        binding.button.setOnClickListener {

            ab.userdata(prince)


        }




    }
}