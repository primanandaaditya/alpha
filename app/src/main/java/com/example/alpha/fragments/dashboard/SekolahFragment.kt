package com.example.alpha.fragments.dashboard


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

import com.example.alpha.R
import com.example.alpha.activities.leaderboard.detail.DetailLeaderboardAdapter
import com.example.alpha.activities.leaderboard.detail.DetailLeaderboardModel


class SekolahFragment : Fragment() {

    private lateinit var lv: ListView

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        lv= activity!!.findViewById(R.id.lv_sekolah)

        var detailLeaderboardModelList = ArrayList<DetailLeaderboardModel>()
        var detailLeaderboardModel: DetailLeaderboardModel

        detailLeaderboardModel = DetailLeaderboardModel(1, "Aida Nirmala", 100)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(2, "Dwi Mahani", 99)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(3, "Muhammad Fatah Firdaus", 98)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(4, "Robby Satria", 96)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(5, "Afrila Zahra Prasetyo", 95)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(6, "Lun Wina", 94)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(7, "Muhammad Rivaldi", 92)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(8, "Robby Satria", 88)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(9, "Winny Rahmah Nia", 87)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        detailLeaderboardModel = DetailLeaderboardModel(10, "Muhammad Rivaldi", 80)
        detailLeaderboardModelList.add(detailLeaderboardModel)

        var detailLeaderboardAdapter= DetailLeaderboardAdapter(detailLeaderboardModelList, activity!!)
        lv.adapter=detailLeaderboardAdapter

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_sekolah, container, false)
    }


}
