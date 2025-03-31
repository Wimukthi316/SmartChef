package com.example.smartchef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Handle system insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize views
        val loginButton: Button = findViewById(R.id.button5)
        val backImage: ImageView = findViewById(R.id.imageView40)
        val usernameInput: EditText = findViewById(R.id.editText4) // Username field
        val passwordInput: EditText = findViewById(R.id.editText2) // Password field

        // Navigate to MealPlans when login button is clicked
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            // Validate username and password
            if (validateUsername(username) && validatePassword(password)) {
                // Proceed to MealPlans activity
                startActivity(Intent(this, Mealplans::class.java))
            } else {
                // Show error messages
                if (!validateUsername(username)) {
                    usernameInput.error = "Username must contain only letters."
                }
                if (!validatePassword(password)) {
                    passwordInput.error = "Password must contain at least one letter and one number."
                }
            }
        }

        // Navigate to Registration when back image is clicked
        backImage.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }

    // Function to validate username (only letters allowed)
    private fun validateUsername(username: String): Boolean {
        val regex = Regex("^[a-zA-Z]+\$")
        return regex.matches(username)
    }

    // Function to validate password (must contain at least one letter and one number)
    private fun validatePassword(password: String): Boolean {
        val regex = Regex("^(?=.*[A-Za-z])(?=.*\\d).+\$")
        return regex.matches(password)
    }
}