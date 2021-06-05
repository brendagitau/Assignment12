package com.example.loginandsignuphw12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class signUp : AppCompatActivity() {
    lateinit var tilName:TextInputEditText
    lateinit var tilPhone:TextInputEditText
    lateinit var tilEmail:TextInputEditText
    lateinit var tilPassword:TextInputEditText
    lateinit var spGender:Spinner
    lateinit var btnlogin2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        castViews()
        clickRegister()
    }
    fun castViews(){
        tilName = findViewById(R.id.tilName)
        tilEmail = findViewById(R.id.tilEmail)
        tilPhone = findViewById(R.id.tilPhone)
        tilPassword = findViewById(R.id.tilPassword)
        btnlogin2=findViewById(R.id.btnlogin2)
        spGender = findViewById(R.id.spGender)
        val gender=arrayOf("Female","Male")
        val genderAdapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=genderAdapter
    }
    fun clickRegister() {
        var tilName = tilName.text.toString()
        var tilEmail = tilEmail.text.toString()
        var tilPhone = tilPhone.text.toString()
        var tilPassword = tilPassword.text.toString()
        btnlogin2.setOnClickListener {
            val intent= Intent(baseContext,login::class.java)
            startActivity(intent)
        }
        var spGender = spGender.selectedItem.toString()
        var message = "thank you for signing up"
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }



}