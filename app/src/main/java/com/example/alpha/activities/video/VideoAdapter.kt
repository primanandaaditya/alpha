package com.example.alpha.activities.video

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.alpha.R
import kotlinx.android.synthetic.main.list_video.view.*

class VideoAdapter: BaseAdapter {

    var context: Context
    var model: ArrayList<VideoModel>

    constructor(context: Context, model: ArrayList<VideoModel>) : super() {
        this.context = context
        this.model = model
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.list_video, parent, false)

        var data = this.model.get(position)

        view.tv_judul.setText(data.judul)
        view.tv_ago.setText(data.ago)
        view.tv_view.setText(data.view)
        return view
    }

    override fun getItem(position: Int): Any {
       return model.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getCount(): Int {
        return model.size
    }
}