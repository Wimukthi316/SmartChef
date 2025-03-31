package com.example.smartchef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen04)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
            finish()

        }
        val backArrow: ImageView = findViewById(R.id.imageView25)
        backArrow.setOnClickListener {
            val intent = Intent(this, Screen03::class.java)
            startActivity(intent)
        }
    }
}