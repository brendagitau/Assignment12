package com.example.loginandsignuphw12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class login : AppCompatActivity() {
    lateinit var tilname:TextInputEditText
    lateinit var tilPass:TextInputEditText
    lateinit var btnLog:Button
    lateinit var btnsighnup:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        castViews()
        clicks()



    }
    fun castViews(){
        var tilname = findViewById<TextInputEditText>(R.id.tilname)
        var tilPass = findViewById<TextInputEditText>(R.id.tilPass)
        var btnLog = findViewById<Button>(R.id.btnLog)
        var btnsighnup = findViewById<Button>(R.id.btnsighnup)
    }
    fun clicks(){
        var tilname = tilname.text.toString()
        var tilPass = tilPass.text.toString()

        btnLog.setOnClickListener {
            val intent= Intent(baseContext,Home::class.java)
            startActivity(intent)
        }

        btnsighnup.setOnClickListener {
            val intent= Intent(baseContext,signUp::class.java)
            startActivity(intent)
        }
    }

}
