package com.example.alpha.activities.to.grafik

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.github.mikephil.charting.charts.LineChart
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.provider.CalendarContract
import androidx.core.content.ContextCompat.getSystemService
import com.example.alpha.R
import com.example.alpha.helper.ChartHelper
import com.example.alpha.helper.Util
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineDataSet


class GrafikToActivity : AppCompatActivity() {

    private lateinit var chart1:LineChart
    private lateinit var chart2:LineChart
    private lateinit var chart3:LineChart
    private lateinit var chart4:LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafik_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        findID()
        buatChart1()
        buatChart2()
        buatChart3()
        buatChart4()

    }

    fun findID(){
        chart1=findViewById(R.id.chart1)
        chart2=findViewById(R.id.chart2)
        chart3=findViewById(R.id.chart3)
        chart4=findViewById(R.id.chart4)
    }

    fun buatChart4(){

        var util=Util()

        var toUTBKSaintek1 = ArrayList<Entry>()
        var toUTBKSaintek2 = ArrayList<Entry>()
        var toUTBKSaintek3 = ArrayList<Entry>()
        var toUTBKSaintek4 = ArrayList<Entry>()

        toUTBKSaintek1.add(Entry(1f, util.Acak()))
        toUTBKSaintek1.add(Entry(2f, util.Acak()))
        toUTBKSaintek1.add(Entry(3f,util.Acak()))

        toUTBKSaintek2.add(Entry(1f, util.Acak()))
        toUTBKSaintek2.add(Entry(2f, util.Acak()))
        toUTBKSaintek2.add(Entry(3f,util.Acak()))

        toUTBKSaintek3.add(Entry(1f, util.Acak()))
        toUTBKSaintek3.add(Entry(2f, util.Acak()))
        toUTBKSaintek3.add(Entry(3f,util.Acak()))

        toUTBKSaintek4.add(Entry(1f, util.Acak()))
        toUTBKSaintek4.add(Entry(2f, util.Acak()))
        toUTBKSaintek4.add(Entry(3f,util.Acak()))



        var ldsUTBKSaintek1 = LineDataSet(toUTBKSaintek1,"Ekonomi")
        ldsUTBKSaintek1.axisDependency=YAxis.AxisDependency.LEFT
        ldsUTBKSaintek1.color=resources.getColor(R.color.orange)
        ldsUTBKSaintek1.setCircleColor(resources.getColor(R.color.orange))

        var ldsUTBKSaintek2 = LineDataSet(toUTBKSaintek2, "Sejarah")
        ldsUTBKSaintek2.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek2.color=Color.RED
        ldsUTBKSaintek2.setCircleColor(Color.RED)

        var ldsUTBKSaintek3 = LineDataSet(toUTBKSaintek3, "Sosiologi")
        ldsUTBKSaintek3.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek3.color=Color.GREEN
        ldsUTBKSaintek3.setCircleColor(Color.GREEN)

        var ldsUTBKSaintek4 = LineDataSet(toUTBKSaintek4, "Geografi")
        ldsUTBKSaintek4.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek4.color=Color.BLACK
        ldsUTBKSaintek4.setCircleColor(Color.BLACK)


        var array=ArrayList<LineDataSet>()
        array.add(ldsUTBKSaintek1)
        array.add(ldsUTBKSaintek2)
        array.add(ldsUTBKSaintek3)
        array.add(ldsUTBKSaintek4)


        var sumbu = HashMap<Int,String>()
        sumbu.put(1,"TO UTBK Saintek #1")
        sumbu.put(2,"TO UTBK Saintek #2")
        sumbu.put(3,"TO UTBK Soshum #1")


        ChartHelper.MultiLineChartFormat(chart4,array,sumbu,"Nilai")


    }

    fun buatChart3(){

        var util=Util()

        var toUTBKSaintek1 = ArrayList<Entry>()
        var toUTBKSaintek2 = ArrayList<Entry>()
        var toUTBKSaintek3 = ArrayList<Entry>()
        var toUTBKSaintek4 = ArrayList<Entry>()

        toUTBKSaintek1.add(Entry(1f, util.Acak()))
        toUTBKSaintek1.add(Entry(2f, util.Acak()))
        toUTBKSaintek1.add(Entry(3f,util.Acak()))

        toUTBKSaintek2.add(Entry(1f, util.Acak()))
        toUTBKSaintek2.add(Entry(2f, util.Acak()))
        toUTBKSaintek2.add(Entry(3f,util.Acak()))

        toUTBKSaintek3.add(Entry(1f, util.Acak()))
        toUTBKSaintek3.add(Entry(2f, util.Acak()))
        toUTBKSaintek3.add(Entry(3f,util.Acak()))

        toUTBKSaintek4.add(Entry(1f, util.Acak()))
        toUTBKSaintek4.add(Entry(2f, util.Acak()))
        toUTBKSaintek4.add(Entry(3f,util.Acak()))



        var ldsUTBKSaintek1 = LineDataSet(toUTBKSaintek1,"Matematika")
        ldsUTBKSaintek1.axisDependency=YAxis.AxisDependency.LEFT
        ldsUTBKSaintek1.color=resources.getColor(R.color.orange)
        ldsUTBKSaintek1.setCircleColor(resources.getColor(R.color.orange))

        var ldsUTBKSaintek2 = LineDataSet(toUTBKSaintek2, "Fisika")
        ldsUTBKSaintek2.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek2.color=Color.RED
        ldsUTBKSaintek2.setCircleColor(Color.RED)

        var ldsUTBKSaintek3 = LineDataSet(toUTBKSaintek3, "Kimia")
        ldsUTBKSaintek3.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek3.color=Color.GREEN
        ldsUTBKSaintek3.setCircleColor(Color.GREEN)

        var ldsUTBKSaintek4 = LineDataSet(toUTBKSaintek4, "Biologi")
        ldsUTBKSaintek4.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek4.color=Color.BLACK
        ldsUTBKSaintek4.setCircleColor(Color.BLACK)


        var array=ArrayList<LineDataSet>()
        array.add(ldsUTBKSaintek1)
        array.add(ldsUTBKSaintek2)
        array.add(ldsUTBKSaintek3)
        array.add(ldsUTBKSaintek4)


        var sumbu = HashMap<Int,String>()
        sumbu.put(1,"TO UTBK Saintek #1")
        sumbu.put(2,"TO UTBK Saintek #2")
        sumbu.put(3,"TO UTBK Soshum #1")


        ChartHelper.MultiLineChartFormat(chart3,array,sumbu,"Nilai")

    }

    fun buatChart2(){

        var util=Util()

        var toUTBKSaintek1 = ArrayList<Entry>()
        var toUTBKSaintek2 = ArrayList<Entry>()
        var toUTBKSaintek3 = ArrayList<Entry>()
        var toUTBKSaintek4 = ArrayList<Entry>()
        var toUTBKSaintek5 = ArrayList<Entry>()


        toUTBKSaintek1.add(Entry(1f, util.Acak()))
        toUTBKSaintek1.add(Entry(2f, util.Acak()))
        toUTBKSaintek1.add(Entry(3f,util.Acak()))

        toUTBKSaintek2.add(Entry(1f, util.Acak()))
        toUTBKSaintek2.add(Entry(2f, util.Acak()))
        toUTBKSaintek2.add(Entry(3f,util.Acak()))

        toUTBKSaintek3.add(Entry(1f, util.Acak()))
        toUTBKSaintek3.add(Entry(2f, util.Acak()))
        toUTBKSaintek3.add(Entry(3f,util.Acak()))

        toUTBKSaintek4.add(Entry(1f, util.Acak()))
        toUTBKSaintek4.add(Entry(2f, util.Acak()))
        toUTBKSaintek4.add(Entry(3f,util.Acak()))

        toUTBKSaintek5.add(Entry(1f, util.Acak()))
        toUTBKSaintek5.add(Entry(2f, util.Acak()))
        toUTBKSaintek5.add(Entry(3f,util.Acak()))

        var ldsUTBKSaintek1 = LineDataSet(toUTBKSaintek1,"Penalaran Umum")

        ldsUTBKSaintek1.axisDependency=YAxis.AxisDependency.LEFT
        ldsUTBKSaintek1.color=resources.getColor(R.color.orange)
        ldsUTBKSaintek1.setCircleColor(resources.getColor(R.color.orange))

        var ldsUTBKSaintek2 = LineDataSet(toUTBKSaintek2, "Kemampuan Memahami Bacaan dan Menulis")
        ldsUTBKSaintek2.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek2.color=Color.RED
        ldsUTBKSaintek2.setCircleColor(Color.RED)

        var ldsUTBKSaintek3 = LineDataSet(toUTBKSaintek3, "Pengetahuan dan Pemahaman Umum")
        ldsUTBKSaintek3.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek3.color=Color.GREEN
        ldsUTBKSaintek3.setCircleColor(Color.GREEN)

        var ldsUTBKSaintek4 = LineDataSet(toUTBKSaintek4, "Kemampuan Kuantitatif")
        ldsUTBKSaintek4.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek4.color=Color.BLACK
        ldsUTBKSaintek4.setCircleColor(Color.BLACK)

        var ldsUTBKSaintek5 = LineDataSet(toUTBKSaintek5, "Bahasa Inggris")
        ldsUTBKSaintek5.axisDependency = YAxis.AxisDependency.LEFT
        ldsUTBKSaintek5.color=Color.MAGENTA
        ldsUTBKSaintek5.setCircleColor(Color.MAGENTA)

        var array=ArrayList<LineDataSet>()
        array.add(ldsUTBKSaintek1)
        array.add(ldsUTBKSaintek2)
        array.add(ldsUTBKSaintek3)
        array.add(ldsUTBKSaintek4)
        array.add(ldsUTBKSaintek5)

        var sumbu = HashMap<Int,String>()
        sumbu.put(1,"TO UTBK Saintek #1")
        sumbu.put(2,"TO UTBK Saintek #2")
        sumbu.put(3,"TO UTBK Soshum #1")


        ChartHelper.MultiLineChartFormat(chart2,array,sumbu,"Nilai")

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
