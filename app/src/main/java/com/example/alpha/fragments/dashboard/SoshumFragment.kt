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
import com.example.alpha.activities.leaderboard.global.LeaderboardGlobalAdapter
import com.example.alpha.activities.leaderboard.global.LeaderboardGlobalModel


class SoshumFragment : Fragment() {

    private lateinit var lv: ListView

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        lv= activity!!.findViewById(R.id.lv_soshum)

        var list = ArrayList<LeaderboardGlobalModel>()
        var model: LeaderboardGlobalModel

        model = LeaderboardGlobalModel(1, "Aida Nirmala", 100, "Soshum 3", "24 Jan 2020")
        list.add(model)

        model = LeaderboardGlobalModel(2, "Dwi Mahani", 98, "Soshum 4", "24 Jan 2020")
        list.add(model)

        model = LeaderboardGlobalModel(3, "Muhammad Fatah Firdaus", 94, "Soshum 3", "24 Jan 2020")
        list.add(model)

        model = LeaderboardGlobalModel(4, "Robby Satria", 92, "Soshum 3", "24 Jan 2020")
        list.add(model)

        model = LeaderboardGlobalModel(5, "Lun Wina", 89, "Soshum 2", "24 Jan 2020")
        list.add(model)

        var leaderboardGlobalAdapter= LeaderboardGlobalAdapter(list, activity!!)
        lv.adapter=leaderboardGlobalAdapter

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_soshum, container, false)
    }


}
