package com.adilso.appfinanceiro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.adilso.appfinanceiro.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var activityDashboardBinding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(activityDashboardBinding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.logout -> {
                startActivity(Intent(this, MainActivity::class.java))
                true
            }
            R.id.novaDividaMi-> {
                startActivity(Intent(this, NovaDividaActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}