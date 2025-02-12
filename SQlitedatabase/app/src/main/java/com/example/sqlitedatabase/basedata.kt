package com.example.sqlitedatabase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 2)

abstract class basedata:RoomDatabase() {

   abstract fun da():DAO

}