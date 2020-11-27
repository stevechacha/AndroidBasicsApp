package com.example.androidbasicsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    lateinit var btnOrder:Button
    lateinit var Gender:RadioButton
    lateinit var mNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Gender=findViewById(R.id.male)
        mNext=findViewById(R.id.button6)

        mNext.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }
        btnOrder.setOnClickListener {
            val checkedMestId=Gender.isChecked
        }

    }
}