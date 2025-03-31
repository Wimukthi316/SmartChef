package com.example.smartchef

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class Mealplans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mealplans)

        // Handle Window Insets for Edge-to-Edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to ProfileActivity when ImageView is clicked
        val profileIcon: ImageView = findViewById(R.id.imageView21)
        profileIcon.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        // Navigate to Mealrecipe when the image is clicked
        val imageToRecipe: ImageView = findViewById(R.id.imageView12)
        imageToRecipe.setOnClickListener {
            val intent = Intent(this, Mealrecipe::class.java)
            startActivity(intent)
        }
        val imageToRecipe02: ImageView = findViewById(R.id.imageView13)
        imageToRecipe02.setOnClickListener {
            val intent = Intent(this, Mealrecipe02::class.java)
            startActivity(intent)
        }
        val logoutIcon: ImageView = findViewById(R.id.imageView23)
        logoutIcon.setOnClickListener {
            val intent = Intent(this, Logout::class.java)
            startActivity(intent)
        }
        val nextButton: AppCompatButton = findViewById(R.id.button33)
        nextButton.setOnClickListener {
            val intent = Intent(this, Mealplans02::class.java)
            startActivity(intent)
        }
        // Navigate to Mealplans when button33 is clicked
        val groceryIcon: ImageView = findViewById(R.id.imageView22)
        groceryIcon.setOnClickListener {
            val intent = Intent(this, Grocery::class.java)
            startActivity(intent)
        }

        val notificationIcon: ImageView = findViewById(R.id.imageView8)
        notificationIcon.setOnClickListener {
            val intent = Intent(this, Notification::class.java)
            startActivity(intent)
        }

    }
}
