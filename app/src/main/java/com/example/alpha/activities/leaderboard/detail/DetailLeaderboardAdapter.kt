package com.example.alpha.activities.leaderboard.detail

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.alpha.R
import com.example.alpha.activities.leaderboard.detail.DetailLeaderboardActivity
import kotlinx.android.synthetic.main.list_detail_leaderboard.view.*
import kotlinx.android.synthetic.main.list_leaderboard_home.view.*
import kotlinx.android.synthetic.main.list_leaderboard_home.view.tv_nama

class DetailLeaderboardAdapter: BaseAdapter {

    var array: ArrayList<DetailLeaderboardModel>
    var context: Context

    constructor(array: ArrayList<DetailLeaderboardModel>, context: Context) : super() {
        this.array = array
        this.context = context
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.list_detail_leaderboard, parent, false)


        var data = this.array.get(position)
        view.tv_nama.setText(data.nama)
        view.tv_ranking.setText(data.ranking.toString())
        view.tv_nilai.setText(data.nilai.toString())

        return view
    }

    override fun getItem(position: Int): Any {
        return array.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getCount(): Int {
        return array.size
    }


}