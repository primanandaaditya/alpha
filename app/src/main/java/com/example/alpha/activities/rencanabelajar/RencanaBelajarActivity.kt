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


        //hari senin
        rencana= RencBelajarModel()
        rencana.hari = "Senin"
        rencana.tanggal="1 Januari 2021"
        rencana.lainnya="Tips Belajar Hutata"
        rencana.namaMapelA="Matematika Wajib"
        rencana.ketMapelA="Statistika Dasar"
        rencana.subMapelA="Ukuran Letak Data"
        rencana.gambarMapelA=""
        rencana.namaMapelB="Kemampuan Kuantitatif"
        rencana.ketMapelB="Flashcard"
        rencana.subMapelB="Kecepatan dan Debit"
        rencana.gambarMapelB=""
        rencana.id=1
        rencanas.add(rencana)

        //hari Selasa
        rencana= RencBelajarModel()
        rencana.hari = "Selasa"
        rencana.tanggal="2 Januari 2021"
        rencana.lainnya="Belajar Cara Belajar"
        rencana.namaMapelA="Matematika IPA"
        rencana.ketMapelA="Analisis Turunan Kedua Fungsi"
        rencana.subMapelA="Turunan Kedua Fungsi"
        rencana.gambarMapelA=""
        rencana.namaMapelB="Penalaran Umum"
        rencana.ketMapelB="Pernyataan dalam Teks"
        rencana.subMapelB="Pernyataan Tidak Benar"
        rencana.gambarMapelB=""
        rencana.id=2
        rencanas.add(rencana)

        //hari Rabu
        rencana= RencBelajarModel()
        rencana.hari = "Rabu"
        rencana.tanggal="3 Januari 2020"
        rencana.lainnya="Tujuan Belajar"
        rencana.namaMapelA="Kimia"
        rencana.ketMapelA="Unsur-unsur Golongan Utama"
        rencana.subMapelA="Keragaman Sifat-sifat Kimia dalam Unsur-unsur Golongan Utama"
        rencana.gambarMapelA=""
        rencana.namaMapelB="Bahasa Indonesia"
        rencana.ketMapelB="Teks Editorial"
        rencana.subMapelB="Teks Editorial"
        rencana.gambarMapelB=""
        rencana.id=3
        rencanas.add(rencana)


        //hari Kamis
        rencana= RencBelajarModel()
        rencana.hari = "Kamis"
        rencana.tanggal="4 Januari 2020"
        rencana.lainnya="Tips Belajar - Belief System"
        rencana.namaMapelA="Biologi"
        rencana.ketMapelA="Pembelahan Sel"
        rencana.subMapelA="Tipe Pembelahan Sel"
        rencana.gambarMapelA=""
        rencana.namaMapelB="Bahasa Inggris"
        rencana.ketMapelB="Applying for a Job"
        rencana.subMapelB="Applying for a Job"
        rencana.gambarMapelB=""
        rencana.id=4
        rencanas.add(rencana)


        //hari Jumat
        rencana= RencBelajarModel()
        rencana.hari = "Jumat"
        rencana.tanggal="5 Januari 2020"
        rencana.lainnya="Kamu Tau Nggak? Belajar Fisika"
        rencana.namaMapelA="Fisika"
        rencana.ketMapelA="Listrik Arus Bolak-Balik"
        rencana.subMapelA="Tes Akhir Materi"
        rencana.gambarMapelA=""
        rencana.namaMapelB="Kemampuan Kuantitatif"
        rencana.ketMapelB="Flashcard"
        rencana.subMapelB="Kecepatan dan Debit"
        rencana.gambarMapelB=""
        rencana.id=5
        rencanas.add(rencana)

        rv.apply {
            layoutManager = LinearLayoutManager(this@RencanaBelajarActivity, LinearLayoutManager.HORIZONTAL, false)

        }
        var adapter=RencanaBelajarAdapter.RVData(rencanas)
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
