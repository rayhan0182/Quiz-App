package com.rayhan.kotlinquiz.Data

import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {

    var dsource = Localsourcedata().questionlist

    var count = 0

    var score = 0

   fun currentquestion():DataModel{

    return   dsource[count]

   }

    fun nextquestion():DataModel?{

        count++

      return  if (dsource.size>count){

            currentquestion()

        }else{

         null

        }

    }

    fun correctanser(index:Int){

       if (index==currentquestion().correctanser){

          score+=2

       }else{

          null

       }

    }


    fun getscore():Int{

       return score

    }



}