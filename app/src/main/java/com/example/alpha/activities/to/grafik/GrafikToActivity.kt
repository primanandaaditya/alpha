package com.example.alpha.activities.to.grafik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.github.mikephil.charting.charts.LineChart
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import com.example.alpha.R
import com.example.alpha.helper.ChartHelper


class GrafikToActivity : AppCompatActivity() {

    private lateinit var chart1:LineChart
    private lateinit var chart2:LineChart
    private lateinit var chart3:LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafik_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        findID()
        buatChart1()
        buatChart2()
        buatChart3()

    }

    fun findID(){
        chart1=findViewById(R.id.chart1)
        chart2=findViewById(R.id.chart2)
        chart3=findViewById(R.id.chart3)
    }

    fun buatChart3(){

        val map = HashMap<Int,String>()
        val floats = ArrayList<Float>()

        map.put(1, "TO UTBK 1")
        floats.add(500f)
        map.put(2, "TO UTBK 2")
        floats.add(950f)
        map.put(3, "TO UTBK 3")
        floats.add(620f)

        ChartHelper.LineChartFormat(chart3,map,floats,"Nilai")
    }

    fun buatChart2(){

        val map = HashMap<Int,String>()
        val floats = ArrayList<Float>()

        map.put(1, "Penalaran Umum")
        floats.add(500f)
        map.put(2, "Kemampuan Memahami Bacaan dan Tulisan")
        floats.add(950f)
        map.put(3, "Pengetahuan dan Pemahaman Umum")
        floats.add(620f)
        map.put(4, "Kemampuan Kuantitatif")
        floats.add(780f)
        map.put(5, "Bahasa Inggris")
        floats.add(450f)

        ChartHelper.LineChartFormat(chart2,map,floats,"Nilai")
    }

    fun buatChart1(){

        val map = HashMap<Int,String>()
        val floats = ArrayList<Float>()

        map.put(1, "TO UTBK 1")
        floats.add(500f)
        map.put(2, "TO UTBK 2")
        floats.add(950f)
        map.put(3, "TO UTBK 3")
        floats.add(620f)

        ChartHelper.LineChartFormat(chart1,map,floats,"Nilai")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //jika tombol back ditekan oleh user

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
