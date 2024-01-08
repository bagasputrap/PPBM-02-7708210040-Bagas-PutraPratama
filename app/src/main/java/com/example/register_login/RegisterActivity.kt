package com.example.register_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val textclick = findViewById<TextView>(R.id.logintext)
        textclick.setOnClickListener {
            val txt = Intent(this, LoginActivity::class.java)
            startActivity(txt)
            finish()
        }

        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
            finish()
        }

        val btnregist = findViewById<TextView>(R.id.btnregist)
        btnregist.setOnClickListener {
            val regist = Intent(this, Slide_To_Act::class.java)
            startActivity(regist)
            finish()
        }
    }
}