package com.adilso.appfinanceiro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.adilso.appfinanceiro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }

    fun onClick(view: View){
        when(view){
            activityMainBinding.novoCadastro -> {
                startActivity(Intent(this, NovoCadastroActivity::class.java))
            }

            activityMainBinding.recSenha -> {
                startActivity(Intent(this,RecuperarSenhaActivity::class.java))
            }

            activityMainBinding.entrar -> {
                startActivity(Intent(this,DashboardActivity::class.java))
            }
        }
    }
}