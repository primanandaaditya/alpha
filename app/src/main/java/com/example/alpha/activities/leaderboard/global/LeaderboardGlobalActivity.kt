package com.example.alpha.activities.leaderboard.global

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.alpha.R
import com.example.alpha.activities.leaderboard.askgram.LeaderboardAskgramActivity
import com.example.alpha.activities.leaderboard.global.ui.main.SectionsPagerAdapter

class LeaderboardGlobalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard_global)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //jika tombol back ditekan oleh user

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