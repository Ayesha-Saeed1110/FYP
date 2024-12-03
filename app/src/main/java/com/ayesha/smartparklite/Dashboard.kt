package com.ayesha.smartparklite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.activity.enableEdgeToEdge

import androidx.activity.enableEdgeToEdge




class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Navigate to dashboard page
        val dashboardButton: Button = findViewById(R.id.logoutButton)
        dashboardButton.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
        val ThirdActButton = findViewById<ImageButton>(R.id.btnthree)
        ThirdActButton.setOnClickListener {
            val intent = Intent(this, onlinePayment::class.java)
            startActivity(intent)
        }
    }
}