package com.example.register_login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val textclick2 = findViewById<TextView>(R.id.registtext)
        textclick2.setOnClickListener {
            val txt2 = Intent(this, RegisterActivity::class.java)
            startActivity(txt2)
            finish()
        }
        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
            finish()
        }

        val loginbutton = findViewById<TextView>(R.id.loginbtn)
        loginbutton.setOnClickListener {
            val lgn = Intent(this, ProfileActivity::class.java)
            startActivity(lgn)
            finish()
        }

    }
}