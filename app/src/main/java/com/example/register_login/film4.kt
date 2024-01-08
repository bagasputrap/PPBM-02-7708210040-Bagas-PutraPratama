package com.example.register_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog

class film4 : AppCompatActivity() {

    lateinit var btnShowBottomSheet: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film4)

        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val back = Intent(this, ProfileActivity::class.java)
            startActivity(back)
            finish()
        }

        btnShowBottomSheet = findViewById(R.id.buyticket);

        btnShowBottomSheet.setOnClickListener{

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_sheet4, null)
            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}