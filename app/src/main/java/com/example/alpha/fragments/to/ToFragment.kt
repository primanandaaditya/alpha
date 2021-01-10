package com.example.alpha.fragments.to


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.example.alpha.R
import android.widget.ImageView
import com.example.alpha.activities.bank_soal.list.ListBankSoalActivity
import com.example.alpha.activities.list_tryout.ListTryoutActivity
import com.example.alpha.activities.to.intro.IntroToActivity


class ToFragment : Fragment() {

    private lateinit var iv_tryout: ImageView
    private lateinit var iv_bank_soal: ImageView
    private lateinit var btn1: Button
    private lateinit var btn2: Button

    fun pindah(){
        var intent = Intent(activity, IntroToActivity::class.java)
        startActivity(intent)
    }

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

        btn1 = root.findViewById(R.id.btn1)
        btn2 = root.findViewById(R.id.btn2)

        btn1.setOnClickListener(View.OnClickListener {
            pindah()
        })

        btn2.setOnClickListener(View.OnClickListener {
            pindah()
        })
        return root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }



}
