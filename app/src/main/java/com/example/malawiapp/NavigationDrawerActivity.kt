package com.example.malawiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toolBar: androidx.appcompat.widget.Toolbar
    private lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        drawer = findViewById(R.id.drawerLayout)
        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
        navView = findViewById(R.id.NavView)
        navView.setNavigationItemSelectedListener(this)
        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolBar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.nav_history->{
               val intentHistory = Intent(this@NavigationDrawerActivity,HistoryActivity::class.java)
               startActivity(intentHistory)
           }
           R.id.nav_culture->{
               val intentHistory = Intent(this@NavigationDrawerActivity,CultureActivity::class.java)
               startActivity(intentHistory)
           }
           R.id.nav_entertain ->{
               val intentEntertain = Intent(this@NavigationDrawerActivity,EntertainmentActivity::class.java)
               startActivity(intentEntertain)
           }
           R.id.nav_vacation ->{
               val intentvacation = Intent(this@NavigationDrawerActivity,VacationActivity::class.java)
               startActivity(intentvacation)
           }
           R.id.nav_what ->{
               val intentwhat = Intent(this@NavigationDrawerActivity,OutdoorActivity::class.java)
               startActivity(intentwhat)
           }

       }
        return true
    }
    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }

    }
}
