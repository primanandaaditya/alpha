package com.example.alpha.activities.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alpha.R
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import com.example.alpha.activities.MainActivity
import android.content.Intent
import androidx.core.os.HandlerCompat.postDelayed
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService

import android.os.Handler
import com.example.alpha.helper.Constants


class SplashActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            /* Create an Intent that will start the MainActivity. */
            val mainIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, Constants.SPLASH_SCREEN_TIME)

    }
}
