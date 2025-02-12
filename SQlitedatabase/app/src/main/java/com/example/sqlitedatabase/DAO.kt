package com.example.sqlitedatabase

import androidx.room.Dao
import androidx.room.Insert

@Dao

interface DAO {

 @Insert

  fun userdata(user: User)


}