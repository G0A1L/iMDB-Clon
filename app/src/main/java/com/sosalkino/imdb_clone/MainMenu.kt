package com.sosalkino.imdb_clone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val linkToArtist: ImageView = findViewById(R.id.imageView21)

        linkToArtist.setOnClickListener {
            val intent = Intent(this, ArtistInfo::class.java)
            startActivity(intent)
        }
    }
}