package com.sosalkino.imdb_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AutAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aut)

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
                val isAuth = db.getUser(login, pass)

                if(isAuth) {
                    /* переход */
                    userLogin.text.clear()
                    userPass.text.clear()
                }
                else {
                    Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, MainMenu::class.java)
                    startActivity(intent)
                }


            }

        }
    }
}