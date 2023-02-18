package com.example.proyectoprctica_eval2_guiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityBrowserBinding

class browser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var imagenUsuarioB= intent.getStringExtra("ImagenUsuario")
        var imagenAtrasFilm= intent.getStringExtra("ImagenUsuarioAtras")


        if (imagenUsuarioB.equals("usuario1") || imagenAtrasFilm.equals("usuario1")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario1)
            imagenUsuarioB="usuario1"
        }else if (imagenUsuarioB.equals("usuario2") || imagenAtrasFilm.equals("usuario2")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario2)
            imagenUsuarioB="usuario2"
        }else if (imagenUsuarioB.equals("usuario3") || imagenAtrasFilm.equals("usuario3")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario3)
            imagenUsuarioB="usuario3"
        }else if (imagenUsuarioB.equals("usuario4") || imagenAtrasFilm.equals("usuario4")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario4)
            imagenUsuarioB="usuario4"
        }

        binding.imagenUsuario.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.pelicula1.setOnClickListener(){
            val intent= Intent(this, film::class.java)
            intent.putExtra("ImagenUsuarioB",imagenUsuarioB)
            startActivity(intent)


        }
    }
}