package com.etobon.mathapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread{
            Thread.sleep(1000)
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }




    }
}