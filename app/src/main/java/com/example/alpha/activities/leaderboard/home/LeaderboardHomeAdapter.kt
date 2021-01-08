package com.example.alpha.activities.leaderboard.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.alpha.R
import kotlinx.android.synthetic.main.list_leaderboard_home.view.*

class LeaderboardHomeAdapter: BaseAdapter {

    var array: ArrayList<String>
    var context: Context

    constructor(array: ArrayList<String>, context: Context) : super() {
        this.array = array
        this.context = context
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.list_leaderboard_home, parent, false)


        var data = this.array.get(position)
        view.tv_nama.setText(data)
        view.btn_lihat.setOnClickListener(View.OnClickListener {

        })

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