package com.rayhan.kotlinquiz.Data

class viewmodel {

    var localsourcedata = Localsourcedata()

    var counting = 0

    fun currentquiz(): DataModel {

        return localsourcedata.questionlist[counting]

    }

    fun nextquiz(): DataModel {

        counting++

        return currentquiz()

    }






}