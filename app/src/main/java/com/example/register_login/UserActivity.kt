package com.example.register_login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.TextView

class UserActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val back = Intent(this, ProfileActivity::class.java)
            startActivity(back)
            finish()
        }

        val logout = findViewById<TextView>(R.id.logout)
        logout.setOnClickListener {
            val logout = Intent(this, MainActivity::class.java)
            startActivity(logout)
            finish()
        }

        val purchasebtn = findViewById<TextView>(R.id.purchase)
        purchasebtn.setOnClickListener {
            val purchase = Intent(this, PurchaseActivity::class.java)
            startActivity(purchase)
            finish()
        }

    }
}