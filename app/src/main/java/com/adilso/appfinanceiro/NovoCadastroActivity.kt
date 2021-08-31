package com.adilso.appfinanceiro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.adilso.appfinanceiro.databinding.ActivityNovoCadastroBinding

class NovoCadastroActivity : AppCompatActivity() {
    private lateinit var activityNovoCadastroBinding: ActivityNovoCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityNovoCadastroBinding = ActivityNovoCadastroBinding.inflate(layoutInflater)
        setContentView(activityNovoCadastroBinding.root)
    }
    fun onClick(view: View){
        when(view){
            activityNovoCadastroBinding.voltar -> {
                startActivity(Intent(this, MainActivity::class.java))
            }

            activityNovoCadastroBinding.confirmarCadastro -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}