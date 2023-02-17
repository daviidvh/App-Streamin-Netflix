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
        var imagenUsuario=""

         binding.usuario1.setOnClickListener(){
             val intent= Intent(this, browser::class.java)
             imagenUsuario=binding.imageButton.id.toString()
             intent.putExtra("ImagenUsuario",imagenUsuario)
             startActivity(intent)


         }
        binding.usuario2.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            imagenUsuario="usuario2"
            intent.putExtra("ImagenUsuario",imagenUsuario)
            startActivity(intent)

        }
        binding.usuario3.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            imagenUsuario="usuario3"
            intent.putExtra("ImagenUsuario",imagenUsuario)
            startActivity(intent)


        }
        binding.usuario4.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            imagenUsuario="usuario4"
            intent.putExtra("ImagenUsuario",imagenUsuario)
            startActivity(intent)


        }

    }
}