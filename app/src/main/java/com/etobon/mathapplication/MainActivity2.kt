package com.etobon.mathapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.etobon.mathapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var fragment1: Fragment1
    private lateinit var fragment2: Formula2
    private lateinit var fragment3: Formula3
    private lateinit var spinner:Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        spinner = findViewById(R.id.SpinnerFormulas)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragment1= Fragment1()
        fragment2 = Formula2()
        fragment3 = Formula3()

        supportFragmentManager.beginTransaction().add(R.id.MainActivity2, fragment1).commit()

        val lista = listOf("Formula 1", "Formula 2","Formula 3")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)

        spinner.adapter = adaptador

        spinner.onItemSelectedListener= object: AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                if(pos == 0) {
                    supportFragmentManager.beginTransaction().replace(R.id.MainActivity2, fragment1).commit()
                }
                else if(pos == 1) {
                    supportFragmentManager.beginTransaction().replace(R.id.MainActivity2, fragment2).commit()
                }
                else if(pos == 2) {
                    supportFragmentManager.beginTransaction().replace(R.id.MainActivity2, fragment3).commit()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }



    }
    }
}