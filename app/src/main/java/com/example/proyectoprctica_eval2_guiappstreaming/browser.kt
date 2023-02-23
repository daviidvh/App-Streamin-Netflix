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

        /**Lo que hacemos es traernos las imagenes desde la seleccion de perfiles
         *  y tambien nos lo traemos de la imagen de la pelicula**/
        if (imagenUsuarioB.equals("usuario1") || imagenAtrasFilm.equals("usuario1")){
            imagenUsuarioB="usuario1"
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario1)
        }else if (imagenUsuarioB.equals("usuario2") || imagenAtrasFilm.equals("usuario2")){
            imagenUsuarioB="usuario2"
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario2)
        }else if (imagenUsuarioB.equals("usuario3") || imagenAtrasFilm.equals("usuario3")){
            imagenUsuarioB="usuario3"
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario3)
        }else if (imagenUsuarioB.equals("usuario4") || imagenAtrasFilm.equals("usuario4")){
            imagenUsuarioB="usuario4"
            binding.imagenUsuario.setBackgroundResource(R.drawable.usuario4)
        }

        /** Al hacer click mandamos la imagen al activity de film**/
        binding.botonReproducir.setOnClickListener(){
            val intent= Intent(this, film::class.java)
            intent.putExtra("ImagenUsuarioB",imagenUsuarioB)
            startActivity(intent)
        }
        /**Al clicar nos volvemos a la seleccion de usuarios**/
        binding.imagenUsuario.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        /** Al hacer click mandamos la imagen al activity de film**/
        binding.pelicula1.setOnClickListener(){
            val intent= Intent(this, film::class.java)
            intent.putExtra("ImagenUsuarioB",imagenUsuarioB)
            startActivity(intent)
        }
        /** Al hacer click mandamos la imagen al activity del main a la seleccion de perfiles**/
        binding.botonInicio.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            intent.putExtra("ImagenUsuarioB",imagenUsuarioB)
            startActivity(intent)
        }

        binding.pelicula2.setOnClickListener(){
            val intent=Intent(this,film::class.java)
            startActivity(intent)

        }
    }
}