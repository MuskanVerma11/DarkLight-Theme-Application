package com.example.interactiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.buttonDark)
        val buttonLight=findViewById<Button>(R.id.buttonLight)
        val layout=findViewById<LinearLayout>(R.id.layout)
        var image=findViewById<ImageView>(R.id.action_image)

        buttonDark.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.black)
            image.setImageResource(R.drawable.moon)

        }

        buttonLight.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.white)
            image.setImageResource(R.drawable.sun)
        }
    }
}