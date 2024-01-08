package com.example.register_login
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ProfileActivity : AppCompatActivity() {

    val city = arrayOf("Bandung","Tangerang","Jakarta")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val spinner = findViewById<Spinner>(R.id.spinner1)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Selected City is =" + city[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        val profilebtn = findViewById<ImageView>(R.id.profile)
        profilebtn.setOnClickListener {
            val profile = Intent(this, UserActivity::class.java)
            startActivity(profile)
            finish()
        }

        val film3btn = findViewById<ImageView>(R.id.film3)
        film3btn.setOnClickListener {
            val film3 = Intent(this, film3::class.java)
            startActivity(film3)
            finish()
        }

        val film1btn = findViewById<ImageView>(R.id.film1)
        film1btn.setOnClickListener {
            val film1 = Intent(this, film1::class.java)
            startActivity(film1)
            finish()
        }

        val film2btn = findViewById<ImageView>(R.id.film2)
        film2btn.setOnClickListener {
            val film2 = Intent(this, film2::class.java)
            startActivity(film2)
            finish()
        }

        val film4btn = findViewById<ImageView>(R.id.film4)
        film4btn.setOnClickListener {
            val film4 = Intent(this, film4::class.java)
            startActivity(film4)
            finish()
        }

        val film5btn = findViewById<ImageView>(R.id.film5)
        film5btn.setOnClickListener {
            val film5 = Intent(this, film5::class.java)
            startActivity(film5)
            finish()
        }

        val pesenmakanbtn = findViewById<Button>(R.id.makanBTN)
        pesenmakanbtn.setOnClickListener {
            val makan = Intent(this, ListViewActivity::class.java)
            startActivity(makan)
            finish()
        }


    }

}