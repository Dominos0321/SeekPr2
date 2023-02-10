package com.example.seekandprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val img1 = findViewById<ImageView>(R.id.imageView3)
    val img2 = findViewById<ImageView>(R.id.imageView4)
    val img3 = findViewById<ImageView>(R.id.imageView6)
    val btn = findViewById<Button>(R.id.button)

    var pgb = findViewById<ProgressBar>(R.id.progressBar)
    var pgb2 = findViewById<ProgressBar>(R.id.progressBar3)


}