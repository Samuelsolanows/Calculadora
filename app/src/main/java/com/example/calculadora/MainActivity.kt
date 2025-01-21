package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import com.example.calculadora.databinding.ActivityMainBinding
import java.util.stream.Stream

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var num1: Any = 0.0
    var num2: Any = 0.0
    var textPanttalla = ""
    var operacion = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pintar()
    }

    private fun pintar() {
        binding.apply {
            btn1.setOnClickListener { quitarCero(); agregarNumero(num = "1") }
            btn2.setOnClickListener { quitarCero(); agregarNumero(num = "2") }
            btn3.setOnClickListener { quitarCero(); agregarNumero(num = "3") }
            btn4.setOnClickListener { quitarCero(); agregarNumero(num = "4") }
            btn5.setOnClickListener { quitarCero(); agregarNumero(num = "5") }
            btn6.setOnClickListener { quitarCero(); agregarNumero(num = "6") }
            btn7.setOnClickListener { quitarCero(); agregarNumero(num = "7") }
            btn8.setOnClickListener { quitarCero(); agregarNumero(num = "8") }
            btn9.setOnClickListener { quitarCero(); agregarNumero(num = "9") }
            btn0.setOnClickListener { agregarNumero(num = "0") }
            btnClear.setOnClickListener { clear() }
///            btnSuma.setOnClickListener {}
//            btnResta.setOnClickListener { oprcnPresionada(opecion = "-") }
//            btnDivison.setOnClickListener { oprcnPresionada(opecion = "/") }
//            btnMultiplicacion.setOnClickListener { oprcnPresionada(opecion = "x") }
//            btnResultado.setOnClickListener {  calcular(
//                num1.toString().toDouble(), num2.toString().toDouble(), operacion
//            ) }

        }
    }

    private fun calcular(num1: Double, num2: Double, operador: String): Double {
        return when (operador) {
            "+" ->  num1 + num2
            "-" -> num1 - num2
            "X" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    throw ArithmeticException("No se puede dividir entre 0")
                } else {
                    num1 / num2
                }
            }

            else -> throw IllegalArgumentException("Operador no válido: $operador")
        }
    }


    private fun agregarNumero(num: String) {

        if (textPanttalla == "0" && num == "0") {
            return
        }
        if (textPanttalla == "0" && num != "0") {
            textPanttalla = num
        } else {
            textPanttalla += num
        }
        binding.txtPantalla.text = textPanttalla

    }

    private fun clear() {
        num1 = 0.0
        num2 = 0.0
        textPanttalla = ""
        binding.txtPantalla.text = "0"
        operacion = ""
        binding.txtHistorial.text = ""
    }

    private fun quitarCero() {

        binding.apply {
            if (txtPantalla.text == "0") {
                txtPantalla.text = "0"
            }
        }
    }
}

