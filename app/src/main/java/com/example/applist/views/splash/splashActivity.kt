package com.example.applist.views.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.applist.R
import com.example.applist.views.main.MainActivity
import org.jetbrains.anko.startActivity

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //intent menggunakan library anko
        Handler().postDelayed({
            startActivity<MainActivity>()
        }, 1200)
    }
}
