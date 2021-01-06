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
import com.example.alpha.activities.bank_soal.list.ListBankSoalActivity
import com.example.alpha.activities.list_tryout.ListTryoutActivity
import com.example.alpha.activities.rencanabelajar.RencanaBelajarActivity
import com.example.alpha.activities.to.ToActivity


class ToFragment : Fragment() {

    private lateinit var iv_tryout: ImageView
    private lateinit var iv_bank_soal: ImageView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_to, container, false)


        iv_tryout=root.findViewById(R.id.iv_tryout)
        iv_tryout.setOnClickListener(View.OnClickListener {
            var intent=Intent(activity, ListTryoutActivity::class.java)
            startActivity(intent)
        })

        iv_bank_soal=root.findViewById(R.id.iv_bank_soal)
        iv_bank_soal.setOnClickListener(View.OnClickListener {
            var intent = Intent(activity, ListBankSoalActivity::class.java)
            startActivity(intent)
        })
        return root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }



}
