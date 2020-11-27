package com.example.androidbasicsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    lateinit var mData:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        mData=findViewById(R.id.textViewDta)

        //get string extra activities
        //Getting Data from Second Activty
       // val name=intent.getStringExtra("EXTRA_NAME")
       // val age= intent.getIntExtra("EXTRA_AGE",0)
       // val country=intent.getStringExtra("EXTRA_COUNTRY")
        // val personDataString="$name is $age years old and lives in $country"
        //mData.text=personDataString

        val person=intent.getSerializableExtra("EXTRA_PERSON") as Person
        mData.text=person.toString()
        //using data class to pass above to the next activitiea
        //we use serializable then as to extra the the class


    }
}