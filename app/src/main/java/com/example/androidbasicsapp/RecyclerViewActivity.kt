package com.example.androidbasicsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var mMessage:EditText
    lateinit var mAdd:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val navVieww: RecyclerView = findViewById(R.id.recyclerview)

        mMessage=findViewById(R.id.nameMessage)
        mAdd=findViewById(R.id.addContent)

        var markList= mutableListOf<String>()
        val madapter=MarkAdapter(markList)
        navVieww.adapter=madapter
        navVieww.layoutManager=LinearLayoutManager(this)

        mAdd.setOnClickListener {
            val title=mMessage.text.toString()
            val marks=Mark(title,false)
            markList.add(marks.toString())
               // adapter.notifyDataSetChanged()
                madapter.notifyItemInserted(markList.size-1)
        }



    }
}