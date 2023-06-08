package com.sosalkino.imdb_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ArtistInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_info)

        val linkToAlbum: ImageView = findViewById(R.id.imageView20)
        val homeLink: ImageButton = findViewById(R.id.HomeIconPage)
        linkToAlbum.setOnClickListener {
            val intent = Intent(this, BandanaInfo::class.java)
            startActivity(intent)
        }
        homeLink.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}