package com.example.alpha.activities.to.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.alpha.R
import com.example.alpha.activities.to.screen.TryoutScreenActivity

class IntroToActivity : AppCompatActivity() {

    private lateinit var btn_mulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        btn_mulai=findViewById(R.id.btn_mulai)
        btn_mulai.setOnClickListener(View.OnClickListener {
            var intent= Intent(this, TryoutScreenActivity::class.java)
            startActivity(intent)
            finish()
        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            // Respond to the action bar's Up/Home button
            android.R.id.home -> {
                //NavUtils.navigateUpFromSameTask(this);
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
