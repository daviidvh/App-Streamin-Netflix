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

        Thread.sleep(2000)
        setTheme(R.style.Theme_ProyectoPrácticaEVAL2GUIAppStreaming)
        super.onCreate(savedInstanceState)
        val binding = ActivityLogginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val analytics= FirebaseAnalytics.getInstance(this)
        val bundle=Bundle()
        bundle.putString("message","Integracion de firebase completada")
        analytics.logEvent("InitScreen",bundle)

        title="Registro"


        binding.btnRegistro.setOnClickListener(){
            if (binding.edtEmail.text.isNotEmpty() && binding.edtPassword.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(binding.edtEmail.text.toString(),binding.edtPassword.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this, "Se ha registrado al usuario", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        binding.btnIngresar.setOnClickListener(){
            FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.edtEmail.text.toString(),binding.edtPassword.text.toString()).addOnCompleteListener {
                if (it.isSuccessful){
                    val intent= Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT).show()

                }
            }

        }

    }

    }
