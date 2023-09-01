package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pintar()
    }

    fun pintar() {
        binding.apply {


            btn1.setOnClickListener { txtPantalla.text="1" }
//            btn2.setOnClickListener { quitarCero; numPresionado(num = "2") }
//            btn3.setOnClickListener { quitarCero; numPresionado(num = "3") }
//            btn4.setOnClickListener { quitarCero; numPresionado(num = "4") }
//            btn5.setOnClickListener { quitarCero; numPresionado(num = "5") }
//            btn6.setOnClickListener { quitarCero; numPresionado(num = "6") }
//            btn7.setOnClickListener { quitarCero; numPresionado(num = "7") }
//            btn8.setOnClickListener { quitarCero; numPresionado(num = "8") }
//            btn9.setOnClickListener { quitarCero; numPresionado(num = "9") }
//            btn0.setOnClickListener { quitarCero; numPresionado(num = "0") }
//            btnSuma.setOnClickListener { quitarCero; oprcnPresionada(Suma) }
//            btnResta.setOnClickListener { quitarCero; oprcnPresionada(Resta) }
//            btnDivison.setOnClickListener { quitarCero; oprcnPresionada(Division) }
//            btnMultiplicacion.setOnClickListener { quitarCero; oprcnPresionada(Multiplicacion) }

        }
    }







}