package com.example.alpha.fragments.to


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

import com.example.alpha.R
import com.example.alpha.activities.ui.home.HomeAdapter
import com.example.alpha.activities.ui.home.HomeModel
import java.util.ArrayList
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import com.example.alpha.activities.rencanabelajar.RencanaBelajarActivity
import com.example.alpha.activities.to.ToActivity


class ToFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_to, container, false)


        return root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }



}
