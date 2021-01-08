package com.example.alpha.activities.leaderboard.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import com.example.alpha.R

class LeaderboardHomeActivity : AppCompatActivity() {

    private lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard_home)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        lv=findViewById(R.id.lv)
        var array = ArrayList<String>()
        array.add("Soshum Paket 3")
        array.add("Soshum Paket 2")
        array.add("Soshum Paket 1")
        array.add("Soshum XX")
        array.add("Soshum IX")

        var adapter=LeaderboardHomeAdapter(array, this)
        lv.adapter=adapter


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
