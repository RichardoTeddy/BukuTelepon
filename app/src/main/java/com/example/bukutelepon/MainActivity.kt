package com.example.bukutelepon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var intent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the elements by their actual IDs
        val bukuteleponTextView = findViewById<TextView>(R.id.bukutelepon)
        val tambahButton = findViewById<Button>(R.id.btntambah)
        val lihatdaftarButton = findViewById<Button>(R.id.btnlihatdaftar)


        // Handle click events for both buttons
        tambahButton.setOnClickListener {
            Intent(this,tambahkontak::class.java).also {
                startActivity(it)
            }

        }
        lihatdaftarButton.setOnClickListener {
            Intent(this,daftarkontak::class.java).also {
                startActivity(it)
            }
    }
}
}