package com.example.proyectoprctica_eval2_guiappstreaming

import android.content.Intent
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityFilmBinding


class film : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**Traemos la foto del activity anterior**/
        var imagenUsuarioF= intent.getStringExtra("ImagenUsuarioB")
        var imagenAtras=""

        /**Establecemos la foto y almacenamos para volverla a mandar al activity de donde venimos**/
        if(imagenUsuarioF.equals("usuario1")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario1)
            imagenAtras="usuario1"
        }else if(imagenUsuarioF.equals("usuario2")){
             binding.imagenUsuario.setBackgroundResource(R.drawable.usuario2)
            imagenAtras="usuario2"
        }else if (imagenUsuarioF.equals("usuario3")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario3)
            imagenAtras="usuario3"
        }else if (imagenUsuarioF.equals("usuario4")){
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario4)
            imagenAtras="usuario4"
        }


        /**Al hacer click nos manda a la activity del browser y le mandamos la imagen**/
        binding.botonAtras.setOnClickListener(){
            val intent= Intent(this, browser::class.java)
            intent.putExtra("ImagenUsuarioAtras",imagenAtras)
            startActivity(intent)
        }

        /**Al hacer click nos manda al main que consiste en la seleccion del perfil**/
        binding.imagenUsuario.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}