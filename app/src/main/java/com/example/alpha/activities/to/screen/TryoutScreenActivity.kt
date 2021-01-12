package com.example.alpha.activities.to.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alpha.R

class TryoutScreenActivity : AppCompatActivity(), ITryout {

    override fun getSoal(soal: String?) {
        if (soal != null) {
            Log.d("soal", soal)
        }
        this.tv_soal.setText(soal)
    }

    var array=ArrayList<TryoutModel>()
    var adapter=RVTryoutAdapter(array, this, this)

    private lateinit var rv: RecyclerView
    private lateinit var btnA: Button
    private lateinit var btnB: Button
    private lateinit var btnC: Button
    private lateinit var btnD: Button
    private lateinit var tv_soal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tryout_screen)

        findID()
        buatSoal()

    }

    fun findID(){

        tv_soal=findViewById(R.id.tv_soal)

        rv=findViewById(R.id.rv)


        btnA=findViewById(R.id.btnA)
        btnB=findViewById(R.id.btnB)
        btnC=findViewById(R.id.btnC)
        btnD=findViewById(R.id.btnD)

        btnA.setOnClickListener(View.OnClickListener {
            semuaTombolBiru()
            orangeTombol(btnA)
        })

        btnB.setOnClickListener(View.OnClickListener {
            semuaTombolBiru()
            orangeTombol(btnB)
        })

        btnC.setOnClickListener(View.OnClickListener {
            semuaTombolBiru()
            orangeTombol(btnC)
        })

        btnD.setOnClickListener(View.OnClickListener {
            semuaTombolBiru()
            orangeTombol(btnD)
        })


    }

    fun orangeTombol(tombol: Button){
        tombol.setBackgroundResource(R.drawable.rounded_opsi_orange_button)
    }

    fun semuaTombolBiru(){
        btnA.setBackgroundResource(R.drawable.rounded_opsi_button)
        btnB.setBackgroundResource(R.drawable.rounded_opsi_button)
        btnC.setBackgroundResource(R.drawable.rounded_opsi_button)
        btnD.setBackgroundResource(R.drawable.rounded_opsi_button)
    }

    fun buatSoal(){

        var model: TryoutModel

        for (i in 1..10) {
            if (i==1){
                model = TryoutModel(i,i,"Soal ke " + i.toString(),"","","",0, true,"","","","")
            }else{
                model = TryoutModel(i,i,"Soal ke " + i.toString(),"","","",0, false, "","","","")
            }

            array.add(model)
        }

        rv.apply {
            layoutManager = LinearLayoutManager(this@TryoutScreenActivity,LinearLayoutManager.HORIZONTAL,false)
        }

        rv.adapter = adapter

        tv_soal.setText(array.get(0).soal)
    }

}
