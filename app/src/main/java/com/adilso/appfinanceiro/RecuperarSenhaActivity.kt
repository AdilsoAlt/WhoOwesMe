package com.adilso.appfinanceiro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.adilso.appfinanceiro.databinding.ActivityRecuperarSenhaBinding

class RecuperarSenhaActivity : AppCompatActivity() {
    private lateinit var activityRecuperarSenhaBinding: ActivityRecuperarSenhaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityRecuperarSenhaBinding = ActivityRecuperarSenhaBinding.inflate(layoutInflater)
        setContentView(activityRecuperarSenhaBinding.root)
    }

    fun onClick(view: View){
        when(view){
            activityRecuperarSenhaBinding.voltar -> {
                startActivity(Intent(this, MainActivity::class.java))
            }

            activityRecuperarSenhaBinding.confirmarEnvio -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }


}