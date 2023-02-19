package com.example.proyectoprctica_eval2_guiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityLogginBinding
import com.example.proyectoprctica_eval2_guiappstreaming.databinding.ActivityRegistroBinding
import com.google.firebase.auth.FirebaseAuth

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**Hacemos el registro del usuario**/
        binding.btnRegistro.setOnClickListener() {
            if (binding.edtEmailR.text.isNotEmpty() && binding.edtPasswordR.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    binding.edtEmailR.text.toString(),
                    binding.edtPasswordR.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Se ha registrado al usuario", Toast.LENGTH_SHORT)
                            .show()
                        val intent= Intent(this, loggin::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }else{
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}