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
import com.example.alpha.activities.askgram.DetailAskgramActivity

/**
 * A simple [Fragment] subclass.
 */
class AskgramFragment : Fragment() {

    private lateinit var cv: CardView
    private lateinit var ll: LinearLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_askgram, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


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

}
