package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity4 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val editTextTemperatura = findViewById<EditText>(R.id.editTextTemperatura)
        val buttonVolver = findViewById<Button>(R.id.buttonVolver)

        buttonVolver.setOnClickListener {
            // Aquí puedes manejar el valor ingresado si es necesario
            val temperatura = editTextTemperatura.text.toString()
            // Lógica para manejar la temperatura, si es necesario
            finish() // Cierra la actividad y regresa al menú principal
        }
    }
}