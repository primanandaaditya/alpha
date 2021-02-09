package com.example.alpha.activities.to.screen

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.alpha.R
import com.example.alpha.activities.leaderboard.detail.DetailLeaderboardActivity
import kotlinx.android.synthetic.main.list_leaderboard_home.view.*
import kotlinx.android.synthetic.main.nomor_to.view.*

class TryoutScreenAdapter{

    class TryoutScreenAdapter(view: View) : RecyclerView.ViewHolder(view) {
        private val tv_nomor = view.tv_nomor
        fun bindData(data: TryoutModel) {
            tv_nomor.setText(data.nomor.toString())
            if (data.aktiv){
                tv_nomor.setBackgroundResource(R.drawable.circle_textview_orange)
            }
        }
    }

    class RVData(private val datas: List<TryoutModel>) : RecyclerView.Adapter<TryoutScreenAdapter>() {

        override fun getItemCount(): Int = datas.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TryoutScreenAdapter {
            return TryoutScreenAdapter(LayoutInflater.from(parent.context).inflate(R.layout.nomor_to, parent, false))
        }

        override fun onBindViewHolder(holder: TryoutScreenAdapter, position: Int) {
            holder.bindData(datas[position])
        }
    }
}