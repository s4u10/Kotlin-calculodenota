package com.example.calculodenota

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val falta = Integer.parseInt(falta.text.toString())

            if (media >=6 && falta <=10) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + falta)
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + falta)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}
