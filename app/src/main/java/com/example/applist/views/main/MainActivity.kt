package com.example.applist.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.applist.R
import com.example.applist.views.home.HomeFragment
import com.example.applist.views.taskcomplete.TaskCompleteFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupbtmNavMain()
    }

    private fun setupbtmNavMain() {
        btmNavMain.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_home -> {
                    openFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_complete -> {
                    openFragment(TaskCompleteFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }

        btmNavMain.selectedItemId = R.id.action_home
    }

    private fun openFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameMain, fragment)
            .addToBackStack(null)
            .commit()
    }
}
