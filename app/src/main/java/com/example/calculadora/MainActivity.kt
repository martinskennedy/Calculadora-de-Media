package com.example.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular  // atribui o Id(calcular) do Button para a variável
        val resultado = resultado   // atribui o Id(resultado) do TextView para a variável

        btCalcular.setOnClickListener {  // cria as ações do Button

            val nota1 = Integer.parseInt(nota1.text.toString())  // converte para inteiro
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media>=6 && faltas<=10){
                resultado.setText("Aluno aprovado\nMédia Final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.setText("Aluno reprovado"+ "\n" + "Nota Final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}