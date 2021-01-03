package com.example.alpha.fragments.askgram


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

import com.example.alpha.R
import com.example.alpha.activities.askgram.AddPostActivity
import com.example.alpha.activities.askgram.DetailAskgramActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class AskgramFragment : Fragment() {

    private lateinit var cv: CardView
    private lateinit var ll: LinearLayout
    private lateinit var llpost: LinearLayout
    private lateinit var fab: FloatingActionButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_askgram, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        llpost= activity!!.findViewById(R.id.llpost)
        fab = activity!!.findViewById(R.id.fab)

        llpost.setOnClickListener(View.OnClickListener {
            goToPost()
        })

        fab.setOnClickListener(View.OnClickListener {
            goToPost()
        })

        cv= activity!!.findViewById(R.id.cv)
        cv.setOnClickListener(View.OnClickListener {
            var intent=Intent(activity, DetailAskgramActivity::class.java)
            startActivity(intent)
        })

        ll= activity!!.findViewById(R.id.ll)
        ll.setOnClickListener(View.OnClickListener {
            var intent=Intent(activity, DetailAskgramActivity::class.java)
            startActivity(intent)
        })

    }

    internal fun goToPost(){
        var intent=Intent(activity, AddPostActivity::class.java)
        startActivity(intent)
    }

}
