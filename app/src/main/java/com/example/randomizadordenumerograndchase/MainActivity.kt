package com.example.randomizadordenumerograndchase

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.layout)
                }

        fun sorteio (view: View){
            val sortearNumero = findViewById<TextView>(R.id.numeros)
            val numeroNovo = Random.nextInt(1001)

            sortearNumero.setText("$numeroNovo")

        }
            }


