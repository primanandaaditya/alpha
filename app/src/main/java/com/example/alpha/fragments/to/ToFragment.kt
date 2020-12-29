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

    private lateinit var gridview: GridView
    private lateinit var iv_kalender: ImageView
    private lateinit var iv_jam: ImageView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_to, container, false)

        gridview = root.findViewById(R.id.gridview) as GridView
        iv_kalender= root.findViewById(R.id.iv_kalender)
        iv_jam= root.findViewById(R.id.iv_jam)

        iv_kalender.setOnClickListener( View.OnClickListener {
            var intent=Intent(activity, RencanaBelajarActivity::class.java)
            startActivity(intent)
        })

        iv_jam.setOnClickListener(View.OnClickListener {
            var intent=Intent(activity, RencanaBelajarActivity::class.java)
            startActivity(intent)
        })

        buildMenu()
        findID()

        return root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

    internal fun findID(){

    }

    internal fun buildMenu() {

        val homeModels = ArrayList<HomeModel>()
        var homeModel = HomeModel()

        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.fisika)
        homeModels.add(homeModel)

        homeModel= HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.kimia)
        homeModels.add(homeModel)

        homeModel=HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.biologi)
        homeModels.add(homeModel)

        homeModel=HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.matematika)
        homeModels.add(homeModel)

        homeModel=HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.matematika_ipa)
        homeModels.add(homeModel)

        homeModel=HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.sejarah_wajib)
        homeModels.add(homeModel)

        homeModel=HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.bahasa_indonesia)
        homeModels.add(homeModel)

        homeModel=HomeModel()
        homeModel.gambar = R.drawable.ic_tryout
        homeModel.keterangan = resources.getString(R.string.bahasa_inggris)
        homeModels.add(homeModel)


        val menuAdapter = MapelAdapter(activity, homeModels)
        gridview.setAdapter(menuAdapter)

        gridview.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            var intent= Intent(activity, ToActivity::class.java)
            startActivity(intent)
        })
    }

}
