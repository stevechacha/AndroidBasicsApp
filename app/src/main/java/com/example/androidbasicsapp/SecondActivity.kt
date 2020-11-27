package com.example.androidbasicsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    lateinit var mName:EditText
    lateinit var mCountry:EditText
    lateinit var mAge:EditText

    lateinit var mBtnapply:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        mBtnapply=findViewById(R.id.buttonApply)
        mAge=findViewById(R.id.editAge)
        mCountry=findViewById(R.id.editCountry)
        mName=findViewById(R.id.editTextTextPersonName)

        mBtnapply.setOnClickListener {
            val name=mName.text.toString()
            val age=mAge.text.toString().toInt()
            val country=mCountry.text.toString()

           //Passing Data into Activity Third Activity
         //   val intent=Intent(this,ThirdActivity::class.java)
         //   passing using a class

            val person=Person(name,age,country)
            //intent.putExtra("EXTRA_NAME",name)
          //  intent.putExtra("EXTRA_AGE",age)
           // intent.putExtra("EXTRA_COUNTRY",country)
            //using class
            intent.putExtra("EXTRA_PERSON",person)
            startActivity(intent)
        }
    }
}