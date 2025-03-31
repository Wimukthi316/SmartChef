package com.example.smartchef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Logout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logout)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Screen02 when "Yes" button is clicked
        val buttonYes: Button = findViewById(R.id.buttonYes)
        buttonYes.setOnClickListener {
            val intent = Intent(this, Screen02::class.java)
            startActivity(intent)
            finish() // Optional: Closes the current activity
        }

        // Navigate to Mealplans when "No" button is clicked
        val buttonNo: Button = findViewById(R.id.buttonNo)
        buttonNo.setOnClickListener {
            val intent = Intent(this, Mealplans::class.java)
            startActivity(intent)
            finish() // Optional: Closes the current activity
        }
    }
}
