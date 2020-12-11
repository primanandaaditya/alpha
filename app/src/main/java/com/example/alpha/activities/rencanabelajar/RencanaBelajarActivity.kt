package com.example.alpha.activities.rencanabelajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alpha.R

class RencanaBelajarActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView

    fun findId(){
        rv=findViewById(R.id.rv)

    }

    fun populateData(){

        var rencanas : MutableList<RencBelajarModel> = mutableListOf<RencBelajarModel>()
        var rencana: RencBelajarModel

        rencana= RencBelajarModel()
        rencana.hari = "Senin"
        rencana.tanggal="sdfa"
        rencana.lainnya="faa"
        rencana.namaMapelA="aa"
        rencana.ketMapelA=""
        rencana.subMapelA=""
        rencana.gambarMapelA=""
        rencana.namaMapelB="aa"
        rencana.ketMapelB=""
        rencana.subMapelB=""
        rencana.gambarMapelB=""
        rencana.id=1

        rencanas.add(rencana)
        Log.d("jumlah rencana", rencanas.size.toString())


        rv.apply {
            layoutManager = LinearLayoutManager(this@RencanaBelajarActivity, LinearLayoutManager.HORIZONTAL, false)

        }
        var adapter=rbAdapter(rencanas)
        rv.adapter = adapter


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rencana_belajar)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        findId()
        populateData()

    }

    override fun onResume() {
        super.onResume()


    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            // Respond to the action bar's Up/Home button
            android.R.id.home -> {
                //NavUtils.navigateUpFromSameTask(this);
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
