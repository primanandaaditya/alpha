package com.example.alpha.activities.to.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alpha.R

class TryoutScreenActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tryout_screen)

        findID()
        buatSoal()

    }

    fun findID(){
        rv=findViewById(R.id.rv)
        
    }

    fun buatSoal(){
        var array=ArrayList<TryoutModel>()
        var model: TryoutModel

        for (i in 1..20) {
            if (i==2){
                model = TryoutModel(i,i,"","","","",0, true)
            }else{
                model = TryoutModel(i,i,"","","","",0, false)
            }

            array.add(model)
        }

        rv.apply {
            layoutManager = LinearLayoutManager(this@TryoutScreenActivity,LinearLayoutManager.HORIZONTAL,false)
        }
        var adapter = RVTryoutAdapter(array, this)

        rv.adapter = adapter
    }
}
