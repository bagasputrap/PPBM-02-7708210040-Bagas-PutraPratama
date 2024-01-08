package com.example.register_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listview = findViewById<ListView>(R.id.listview)
        val names = arrayOf("Makanan", "Minuman")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1,names
        )

        listview.adapter = arrayAdapter

        listview.setOnItemClickListener { parent, view, i, l ->
            Toast.makeText(this,"Item Selected" + names[i],Toast.LENGTH_LONG)
                .show()
        }

        // Menangani klik pada item ListView
        listview.setOnItemClickListener { parent, view, position, id ->
            // Ambil teks dari item yang diklik
            val selectedItem = parent.getItemAtPosition(position).toString()

            // Buat Intent untuk pindah ke aktivitas yang sesuai
            val intent: Intent = when (selectedItem) {
                "Makanan" -> Intent(this@ListViewActivity, MenuActivity::class.java)
                //"Item 2" -> Intent(this@MainActivity, Item2Activity::class.java)
                //"Item 3" -> Intent(this@MainActivity, Item3Activity::class.java)
                else -> throw IllegalArgumentException("Item tidak dikenali: $selectedItem")
            }

            // Mulai aktivitas yang sesuai
            startActivity(intent)
        }

        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val lgn = Intent(this, ProfileActivity::class.java)
            startActivity(lgn)
            finish()
        }
    }
}