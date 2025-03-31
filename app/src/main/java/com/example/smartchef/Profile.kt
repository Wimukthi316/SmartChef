package com.example.smartchef

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Mealplans when home icon is clicked
        val homeIcon: ImageView = findViewById(R.id.imageView19)
        homeIcon.setOnClickListener {
            val intent = Intent(this, Mealplans::class.java)
            startActivity(intent)
            finish() // Optional: Closes the current activity
        }

        // Navigate back to Mealplans when back arrow is clicked
        val backArrow: ImageView = findViewById(R.id.back_Arrow)
        backArrow.setOnClickListener {
            val intent = Intent(this, Mealplans::class.java)
            startActivity(intent)
            finish()
        }
        val logoutIcon: ImageView = findViewById(R.id.imageView63)
        logoutIcon.setOnClickListener {
            val intent = Intent(this, Logout::class.java)
            startActivity(intent)
        }
        val groceryIcon: ImageView = findViewById(R.id.imageView62)
        groceryIcon.setOnClickListener {
            val intent = Intent(this, Grocery::class.java)
            startActivity(intent)
        }
    }
}
