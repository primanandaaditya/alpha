package com.example.alpha.activities.to.analisa.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ExpandableListView
import com.example.alpha.R

class DetailAnalisaToActivity : AppCompatActivity() {

    private lateinit var elv: ExpandableListView
    var array=ArrayList<DetailAnalisaToModel>()
    var header=ArrayList<String>()
    var list=HashMap<String, DetailAnalisaToModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_analisa_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        findId()
        generateData()

    }

    fun findId(){
        elv= this.findViewById(R.id.elv)
    }

    fun generateData(){

        var model: DetailAnalisaToModel

        model= DetailAnalisaToModel(
                "Penalaran Umum",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Kemampuan Memahami Bacaan dan Menulis",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Pengetahuan dan Pemahaman Umum",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Kemampuan Kuantitatif",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Bahasa Inggris",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Matematika",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Fisika",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Kimia",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        model= DetailAnalisaToModel(
                "Biologi",
                13,
                20,
                130,
                70
        )
        array.add(model)
        header.add(model.tipeSoal)
        list.put(model.tipeSoal,model)

        var adapter = DetailAnalisaAdapter(this, header, list)
        elv.setAdapter(adapter)

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
