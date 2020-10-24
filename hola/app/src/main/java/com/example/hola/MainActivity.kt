package com.example.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import kotlin.String as String1


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_1 = findViewById<Button>(R.id.btn_1)
        val btn_2 = findViewById<Button>(R.id.btn_2)
        val btn_3 = findViewById<Button>(R.id.btn_3)
        val btn_4 = findViewById<Button>(R.id.btn_4)

        val uno = findViewById<EditText>(R.id.number_1)
        val dos = findViewById<EditText>(R.id.number_2)

        val resultado = findViewById<TextView>(R.id.resultado)
        val simbolo = findViewById<TextView>(R.id.simbolo)


        btn_1.setOnClickListener {
            sumar(uno.text.toString().toDouble(),dos.text.toString().toDouble())
        }

        btn_2.setOnClickListener {
            resta(uno.text.toString().toDouble(),dos.text.toString().toDouble())
        }

        btn_3.setOnClickListener {
            multiplicacion(uno.text.toString().toDouble(),dos.text.toString().toDouble())
        }

        btn_4.setOnClickListener {
            division(uno.text.toString().toDouble(),dos.text.toString().toDouble())
        }


    }

     fun sumar(valor1: Double, valor2: Double) {
        resultado.text = "El resultado es:"+(valor1+valor2)
         simbolo.text = "+"
     }

    fun resta(valor1: Double, valor2: Double) {
        resultado.text = "El resultado es:"+(valor1-valor2)
        simbolo.text = "-"
    }

    fun multiplicacion(valor1: Double, valor2: Double) {
        resultado.text = "El resultado es:"+(valor1*valor2)
        simbolo.text = "*"
    }

    fun division(valor1: Double, valor2: Double) {
        resultado.text = "El resultado es:"+(valor1/valor2)
        simbolo.text = "/"
    }
}
