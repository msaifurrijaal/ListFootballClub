package com.example.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFootballs: RecyclerView
    private var list: ArrayList<Football> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFootballs = findViewById(R.id.rv_football)
        rvFootballs.setHasFixedSize(true)

        list.addAll(FootballsData.listData)
        showRecyclerList()

        this.setTitle("List Football Club")
    }

    private fun showRecyclerList() {
        rvFootballs.layoutManager = LinearLayoutManager(this)
        val listFootballAdapter = ListFootballAdapter(list)
        rvFootballs.adapter = listFootballAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {

            }

            R.id.action_profil -> {
                val moveProfil = Intent(this@MainActivity, ProfilActivity::class.java)
                startActivity(moveProfil)
            }
        }
    }

}