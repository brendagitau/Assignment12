package com.example.loginandsignuphw12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSignUp:Button
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castViews()
        clickRegister()
    }
    fun castViews(){

        btnSignUp = findViewById(R.id.btnSignUp)
        btnLogin= findViewById(R.id.btnLogin)
    }
    fun clickRegister(){
        btnSignUp.setOnClickListener {

       val intent = Intent(baseContext,signUp::class.java)
            startActivity(intent)
        }
       btnLogin.setOnClickListener {
            val intent= Intent(baseContext,login::class.java)
           startActivity(intent)
        }
    }

}
