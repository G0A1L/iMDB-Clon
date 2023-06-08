package com.sosalkino.imdb_clone


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regsign_layout)

        val linkToReg: Button = findViewById(R.id.regButton)
        val linkToAuth: Button = findViewById(R.id.autButton)


        linkToAuth.setOnClickListener {
            val intent = Intent(this, AutAct::class.java)
            startActivity(intent)
        }
        linkToReg.setOnClickListener {
            val intent= Intent(this, RegUser::class.java)
            startActivity(intent)
        }
    }
}