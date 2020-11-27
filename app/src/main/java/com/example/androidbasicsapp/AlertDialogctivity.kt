package com.example.androidbasicsapp

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AlertDialogctivity : AppCompatActivity() {
    lateinit var dialogbtn1:Button
    lateinit var dialogbtn2:Button
    lateinit var dialogbtn3:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialogctivity)

        dialogbtn1=findViewById(R.id.dialog1)
        dialogbtn2=findViewById(R.id.dialog2)
        dialogbtn3=findViewById(R.id.dialog3)


        val addContactDialog= AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("do you want do the numver")
            .setIcon(R.drawable.ic_launcher_add_contacts)
            .setPositiveButton("yes"){ _,_ ->
                Toast.makeText(this,"you added the contact",Toast.LENGTH_LONG).show()

            }
            .setNegativeButton("No"){ _,_ ->
                Toast.makeText(this,"you did not add the contact",Toast.LENGTH_LONG).show()
            }.create()

        dialogbtn1.setOnClickListener {
            addContactDialog.show()
        }

        val options= arrayOf("First item","Second item","third item")
        val singleChoiceDialog=AlertDialog.Builder(this)
            .setTitle("choose option")
            .setSingleChoiceItems(options,0){dialogInterface,i,->
                Toast.makeText(this," clicked ${options[i]} ",Toast.LENGTH_LONG).show()
            }
            .setPositiveButton("accepted"){ _,_ ->
                Toast.makeText(this,"you added the contact",Toast.LENGTH_LONG).show()

            }
            .setNegativeButton("declined"){ _,_ ->
                Toast.makeText(this,"you did not add the contact",Toast.LENGTH_LONG).show()
            }.create()
        dialogbtn2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val mutltiChoiceDialog=AlertDialog.Builder(this)
            .setTitle("choosee One Option")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) {_, i,isChecked->
                if (isChecked){
                    Toast.makeText(this,"you added the checked${options[i]}",Toast.LENGTH_LONG).show()
                } else{
                    Toast.makeText(this,"you added the checked${options[i]}",Toast.LENGTH_LONG).show()
                }
            }
            .setPositiveButton("accepted"){ _,_ ->
                Toast.makeText(this,"you added the contact",Toast.LENGTH_LONG).show()

            }
            .setNegativeButton("declined"){ _,_ ->
                Toast.makeText(this,"you did not add the contact",Toast.LENGTH_LONG).show()
            }.create()
        dialogbtn3.setOnClickListener {
            mutltiChoiceDialog.show()
        }
    }
}