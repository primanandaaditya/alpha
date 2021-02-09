package com.example.alpha.activities.to.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.alpha.R
import com.example.alpha.activities.to.intro.IntroToActivity

class ToActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)

        btn1.setOnClickListener(View.OnClickListener {
            pindah()
        })

        btn2.setOnClickListener(View.OnClickListener {
            pindah()
        })
    }

    fun pindah(){
        var intent = Intent(this, IntroToActivity::class.java)
        startActivity(intent)
    }

    override fun onBackPressed() {
        super.onBackPressed()
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
