package com.example.app1


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.image_view)

        Glide.with(this)
            .load("https://cdn-images-1.medium.com/max/1200/1*EDTzRtnBxVEEIdzPMucC6w.jpeg")
            .into(imageView)
    }
}
