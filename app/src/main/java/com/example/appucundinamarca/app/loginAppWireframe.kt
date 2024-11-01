package com.example.appucundinamarca.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appucundinamarca.R

class loginAppWireframe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_app_wireframe)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnlogin = findViewById<Button>(R.id.btnlogin)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)


        btnlogin.setOnClickListener {
            val userText = username.text.toString()
            val passText = password.text.toString()

            if (userText.isNotEmpty() && passText.isNotEmpty()){
            Log.i("Slaudo", "Ha ingresado ${userText}")
                val intent = Intent(this, UserActivity::class.java)
                intent.putExtra("extraName", userText)
                startActivity(intent)
        }else {
                Log.i("Error", "Esto es un error")
            }
        }
    }
}