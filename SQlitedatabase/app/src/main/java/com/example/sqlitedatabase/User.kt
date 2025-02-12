package com.example.sqlitedatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class User(

    @PrimaryKey(autoGenerate = true)

    val serial: Int = 1,

    val brand: String,

    val model: Int,
)
