package br.iesb.mobile.meuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSignUp.setOnClickListener{
            val intencaoDeChamada = Intent(this, SignUpActivity::class.java)
            startActivity(intencaoDeChamada)
        }

        tvForgot.setOnClickListener{
            val intencaoDeChamada = Intent(this, ForgotActivity::class.java)
            startActivity(intencaoDeChamada)
        }

        btLogin.setOnClickListener{

        }

    }
}