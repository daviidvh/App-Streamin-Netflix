package com.example.proyectoprctica_eval2_guiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityLogginBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class loggin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /**Establecemos el tiempo que queremos que dure el splash screen**/
        Thread.sleep(2000)
        /**Usamos el splash screen**/
        setTheme(R.style.Theme_ProyectoPrácticaEVAL2GUIAppStreaming)
        super.onCreate(savedInstanceState)
        val binding = ActivityLogginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /***Hacemos el login del usuario*/
        binding.btnIngresar.setOnClickListener(){
            if (binding.edtEmail.text.isNotEmpty() && binding.edtPassword.text.isNotEmpty()) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.edtEmail.text.toString(),binding.edtPassword.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
        /**Click para el registro**/
        binding.textoregistr.setOnClickListener(){
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }



    }
}
