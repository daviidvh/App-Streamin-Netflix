package com.example.proyectoprctica_eval2_guiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityBrowserBinding
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityFilmBinding

class film : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var imagenUsuario= intent.getStringExtra("ImagenUsuario")

        if (imagenUsuario.equals("usuario1")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario1)
        }else if (imagenUsuario.equals("usuario2")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario2)
        }else if (imagenUsuario.equals("usuario3")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario3)
        }else if (imagenUsuario.equals("usuario4")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario4)
        }



        binding.botonAtras.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            startActivity(intent)
        }
    }
}