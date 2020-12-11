package com.example.alpha.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.example.alpha.R
import com.example.alpha.activities.rencanabelajar.RencanaBelajarActivity


class AkunFragment : Fragment() {

    private lateinit var iv_edit: ImageView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_akun, container, false)




    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        findID()
    }

    fun findID(){
        iv_edit= activity!!.findViewById(R.id.iv_edit)
        iv_edit.setOnClickListener(View.OnClickListener {
//            var intent = Intent(activity, EditAkunActivity::class.java)
            var intent = Intent(activity, RencanaBelajarActivity::class.java)
            startActivity(intent)
        })
    }

}
