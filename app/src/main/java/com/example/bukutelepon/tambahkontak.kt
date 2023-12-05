package com.example.bukutelepon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class tambahkontak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambahkontak)
        // Find UI elements
        val namaEditText = findViewById<EditText>(R.id.nama)
        val noTelpEditText = findViewById<EditText>(R.id.notelp)
        val simpanButton = findViewById<Button>(R.id.simpan)

        // Handle click event on Simpan button
        simpanButton.setOnClickListener {
            // Get user input
            val nama = namaEditText.text.toString()
            val noTelp = noTelpEditText.text.toString()

            // Validate input (optional)
            if (nama.isEmpty() || noTelp.isEmpty()) {
                // Show error message
                Toast.makeText(this, "Harap isi semua data", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Show success message
            Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show()

            // Clear input fields
            namaEditText.text.clear()
            noTelpEditText.text.clear()
    }
}
}