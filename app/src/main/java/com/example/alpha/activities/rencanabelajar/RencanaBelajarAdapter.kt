package com.example.alpha.activities.rencanabelajar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_renc_belajar.view.*
import com.example.alpha.R

class RencanaBelajarAdapter {

    class RVHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val tv_hari = view.tv_hari
        private val tv_tanggal = view.tv_tanggal

        private val tv_namamapela = view.tv_namamapela
        private val tv_ketmapela = view.tv_ketmapela
        private val tv_submapela = view.tv_submapela
        private val tv_gambarmapela = view.iv_gambarmapela

        private val tv_namamapelb = view.tv_namamapelb
        private val tv_ketmapelb = view.tv_ketmapelb
        private val tv_submapelb = view.tv_submapelb
        private val tv_gambarmapelb = view.iv_gambarmapelb

        private val tv_lainnya = view.tv_lainnya

        fun bindData(data: RencBelajarModel) {

            tv_hari.setText(data.hari)
            tv_tanggal.setText(data.tanggal)
            tv_namamapela.setText(data.namaMapelA)
            tv_ketmapela.setText(data.ketMapelA)
            tv_submapela.setText(data.subMapelA)
            tv_namamapelb.setText(data.namaMapelB)
            tv_ketmapelb.setText(data.ketMapelB)
            tv_submapelb.setText(data.subMapelB)
            tv_lainnya.setText(data.lainnya)

        }

    }


    class RVData(private val datas: MutableList<RencBelajarModel>) : RecyclerView.Adapter<RVHolder>() {

        override fun getItemCount(): Int = datas.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVHolder {
            return RVHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_renc_belajar, parent, false))
        }

        override fun onBindViewHolder(holder: RVHolder, position: Int) {
            holder.bindData(datas[position])
        }
    }
}