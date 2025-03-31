package com.example.smartchef

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Mealplans02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mealplans02)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backButton: AppCompatButton = findViewById(R.id.button33)
        backButton.setOnClickListener {
            val intent = Intent(this, Mealplans::class.java)
            startActivity(intent)
        }

        val imageToRecipe: ImageView = findViewById(R.id.imageView68)
        imageToRecipe.setOnClickListener {
            val intent = Intent(this, Mealrecipe::class.java)
            startActivity(intent)
        }
        val imageToRecipe02: ImageView = findViewById(R.id.imageView33)
        imageToRecipe02.setOnClickListener {
            val intent = Intent(this, Mealrecipe02::class.java)
            startActivity(intent)
        }


    }
}