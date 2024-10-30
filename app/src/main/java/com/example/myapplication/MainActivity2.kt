package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla2)


        val buttonMedirTemperatura = findViewById<Button>(R.id.buttonMedirTemperatura)
        buttonMedirTemperatura.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


        val buttonMedirConsumo = findViewById<Button>(R.id.buttonMedirConsumo)
        buttonMedirConsumo.setOnClickListener {

            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }


        val buttonControlAlertas = findViewById<Button>(R.id.buttonControlAlertas)
        buttonControlAlertas.setOnClickListener {

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }


        val buttonAlertas = findViewById<Button>(R.id.buttonAlertas)
        buttonAlertas.setOnClickListener {

            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}