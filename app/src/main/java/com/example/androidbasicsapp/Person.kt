package com.example.androidbasicsapp

import java.io.Serializable


data class Person (
    //Getting data through activities
    //Holding data instead of extras string
    val  name:String,
    val age:Int,
    val country:String
//To pass this class through activities you haave to do serialable stuff
):Serializable
