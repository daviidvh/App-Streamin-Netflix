package com.example.proyectoprctica_eval2_guiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityMainBinding
import com.google.firebase.analytics.FirebaseAnalytics


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var imagenUsuarioP=""

         binding.usuario1P.setOnClickListener(){
             val intent= Intent(this, browser::class.java)
             imagenUsuarioP= "usuario1"
             intent.putExtra("ImagenUsuario",imagenUsuarioP)
             startActivity(intent)


         }
        binding.usuario2P.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            imagenUsuarioP="usuario2"
            intent.putExtra("ImagenUsuario",imagenUsuarioP)
            startActivity(intent)

        }
        binding.usuario3P.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            imagenUsuarioP="usuario3"
            intent.putExtra("ImagenUsuario",imagenUsuarioP)
            startActivity(intent)


        }
        binding.usuario4P.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            imagenUsuarioP="usuario4"
            intent.putExtra("ImagenUsuario",imagenUsuarioP)
            startActivity(intent)


        }

    }
}