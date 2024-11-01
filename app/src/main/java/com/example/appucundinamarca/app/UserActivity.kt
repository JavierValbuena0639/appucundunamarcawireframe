package com.example.appucundinamarca.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appucundinamarca.R

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val saludo = findViewById<TextView>(R.id.saludo)
        val name: String = intent.extras?.getString("extraName").orEmpty()
        val btnUser = findViewById<Button>(R.id.btnuser)
        val Schedules = findViewById<Button>(R.id.Schedules)
        val Calendar = findViewById<Button>(R.id.Calendar)
        val Support = findViewById<Button>(R.id.Support)

        saludo.text = "Hola $name"
        btnUser.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
        Schedules.setOnClickListener {
            val intent = Intent(this, calendarActivity::class.java)
            startActivity(intent)
        }
        Calendar.setOnClickListener {
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
        }
        Support.setOnClickListener {
            val intent = Intent(this, SupportActivity::class.java)
            startActivity(intent)
        }
    }
}