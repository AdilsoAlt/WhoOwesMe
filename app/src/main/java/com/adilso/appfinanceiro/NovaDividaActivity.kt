package com.adilso.appfinanceiro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.adilso.appfinanceiro.databinding.ActivityNovaDividaBinding

class NovaDividaActivity : AppCompatActivity() {
    private lateinit var activityNovaDividaBinding: ActivityNovaDividaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityNovaDividaBinding = ActivityNovaDividaBinding.inflate(layoutInflater)
        setContentView(activityNovaDividaBinding.root)
    }

    fun onClick(view: View){
        when(view){
            activityNovaDividaBinding.btnVoltar -> {
                startActivity(Intent(this, DashboardActivity::class.java))
            }
            activityNovaDividaBinding.btnSalvarDivida -> {
                startActivity(Intent(this, DashboardActivity::class.java))
            }
        }
    }
}