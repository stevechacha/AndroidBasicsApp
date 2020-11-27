package com.example.androidbasicsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ToolBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_menu,menu)
        return true
    }

    //set on click listenner for the menus items

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.contact-> Toast.makeText(this,"you clicked",Toast.LENGTH_LONG).show()
            R.id.setting-> Toast.makeText(this,"you clicked",Toast.LENGTH_LONG).show()
            R.id.contacts-> Toast.makeText(this,"you clicked",Toast.LENGTH_LONG).show()
            R.id.feedback-> Toast.makeText(this,"you clicked",Toast.LENGTH_LONG).show()
        }

        return true
    }
}