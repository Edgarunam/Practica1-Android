package com.etobon.mathapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoFuerza : AppCompatActivity() {
    lateinit var Resultado: TextView
    lateinit var BtnRegresar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_fuerza)

        Resultado = findViewById(R.id.tvResult)
        BtnRegresar = findViewById(R.id.BtnReturn)
        val bundle = intent.extras

        var answer:String? = null

        answer = bundle!!.getString("Fuerza", "Default")
        Resultado.text = answer

        BtnRegresar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}