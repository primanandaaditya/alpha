package com.example.alpha.activities.leaderboard.askgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast
import com.example.alpha.R
import com.example.alpha.activities.leaderboard.detail.DetailLeaderboardAdapter
import com.example.alpha.activities.leaderboard.detail.DetailLeaderboardModel
import com.example.alpha.helper.Util

class LeaderboardAskgramActivity : AppCompatActivity() {

    private lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard_askgram)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)


        findID()
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

    fun findID(){

        var util=Util()
        lv= findViewById(R.id.lv)

        var detailLeaderboardModelList = ArrayList<DetailLeaderboardModel>()
        var detailLeaderboardModel: DetailLeaderboardModel

        detailLeaderboardModel = DetailLeaderboardModel(1, "Aida Nirmala", 100)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(2, "Dwi Mahani", 99)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(3, "Muhammad Fatah Firdaus", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(4, "Robby Satria", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(5, "Afrila Zahra Prasetyo", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(6, "Lun Wina", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(7, "Muhammad Rivaldi", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(8, "Robby Satria", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(9, "Winny Rahmah Nia", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(10, "Muhammad Rivaldi", util.Acak100())
        detailLeaderboardModelList.add(detailLeaderboardModel)

        var detailLeaderboardAdapter= DetailLeaderboardAdapter(detailLeaderboardModelList, this)
        lv.adapter=detailLeaderboardAdapter
    }
}
