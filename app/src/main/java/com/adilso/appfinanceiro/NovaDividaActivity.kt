package com.adilso.appfinanceiro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adilso.appfinanceiro.databinding.ActivityMainBinding
import com.adilso.appfinanceiro.databinding.ActivityNovaDividaBinding

class NovaDividaActivity : AppCompatActivity() {
    private lateinit var activityNovaDividaBinding: ActivityNovaDividaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityNovaDividaBinding = ActivityNovaDividaBinding.inflate(layoutInflater)
        setContentView(activityNovaDividaBinding.root)
    }
}