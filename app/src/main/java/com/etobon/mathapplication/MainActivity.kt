package com.etobon.mathapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread{
            Thread.sleep(3000)
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        
    }
}