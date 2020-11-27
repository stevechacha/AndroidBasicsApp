package com.example.androidbasicsapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImplicitPermissionActivity : AppCompatActivity() {

    lateinit var TakePhoto:ImageView
    lateinit var ChoosePhoto:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_permission)

        TakePhoto=findViewById(R.id.takePhoto)
        ChoosePhoto=findViewById(R.id.choosePhoto)

        ChoosePhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type="image/*"
                startActivityForResult(it,0)
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode== Activity.RESULT_OK && requestCode==0){
            val uri=data?.data
            TakePhoto.setImageURI(uri)
        }
    }
}