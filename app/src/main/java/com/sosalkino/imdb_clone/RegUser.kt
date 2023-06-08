package com.sosalkino.imdb_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class RegUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_layout)

        val userLogin: EditText = findViewById(R.id.emailAuthField)
        val userPass: EditText = findViewById(R.id.passAuthField)
        val button: Button = findViewById(R.id.regStartButton)

        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if(login == "" || pass=="")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else{
                val user= User(login, pass)

                val db = DbHelper(this,null)
                db.addUser(user)

                userLogin.text.clear()
                userPass.text.clear()
                val intent = Intent(this, MainMenu::class.java)
                startActivity(intent)
            }

        }
    }
}