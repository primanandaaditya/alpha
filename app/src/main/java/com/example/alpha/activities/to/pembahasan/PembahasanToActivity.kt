package com.example.alpha.activities.to.pembahasan

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alpha.R
import com.example.alpha.activities.to.finish.FinishToActivity
import com.example.alpha.activities.to.screen.ITryout
import com.example.alpha.activities.to.screen.RVTryoutAdapter
import com.example.alpha.activities.to.screen.TryoutModel

class PembahasanToActivity : AppCompatActivity(), ITryout {


    var array=ArrayList<TryoutModel>()
    var adapter= RVTryoutAdapter(array, this, this)

    private lateinit var rv: RecyclerView

    private lateinit var tv_soal: TextView
    private lateinit var tv_opsiA: TextView
    private lateinit var tv_opsiB: TextView
    private lateinit var tv_opsiC: TextView
    private lateinit var tv_opsiD: TextView
    private lateinit var tv_pembahasan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembahasan_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        findID()
        buatSoal()

    }

    fun findID(){

        tv_soal=findViewById(R.id.tv_soal)
        tv_pembahasan=findViewById(R.id.tv_pembahasan)
        tv_opsiA=findViewById(R.id.tv_opsiA)
        tv_opsiB=findViewById(R.id.tv_opsiB)
        tv_opsiC=findViewById(R.id.tv_opsiC)
        tv_opsiD=findViewById(R.id.tv_opsiD)

        rv=findViewById(R.id.rv)

    }

    override fun getOpsiA(opsi: String?) {
        tv_opsiA.setText(opsi)
    }

    override fun getOpsiB(opsi: String?) {
        tv_opsiB.setText(opsi)
    }

    override fun getOpsiC(opsi: String?) {
        tv_opsiC.setText(opsi)
    }

    override fun getOpsiD(opsi: String?) {
        tv_opsiD.setText(opsi)
    }

    override fun getSoal(soal: String?) {
        if (soal != null) {
            Log.d("soal", soal)
        }
        this.tv_soal.setText(soal)
    }

    fun buatSoal(){

        var model: TryoutModel

        model = TryoutModel(
                1,
                1,
                "Dimanakah ibukota Indonesia?",
                "",
                "",
                "",
                0,
                true,
                "Jakarta",
                "Surabaya",
                "Bandung",
                "Semarang",
                "Jawaban yang benar adalah (A)")
        array.add(model)

        model = TryoutModel(
                2,
                2,
                "Pulau Sumatera sebelah selatan dan barat berbatasan dengan ....",
                "",
                "",
                "",
                0,
                false,
                "Selat Sunda dan Samudera Pasifik",
                "Selat Sunda dan Samudera Indonesia",
                "Selat Sunda dan Samudera Hindia",
                "Selat Sunda dan Samudera Arktik",
                "Jawaban yang benar adalah (B)")
        array.add(model)

        model = TryoutModel(
                3,
                3,
                "Salah satu pelabuhan yang terdapat di Provinsi Sumatera Barat adalah Pelabuhan ....",
                "",
                "",
                "",
                0,
                false,
                "Teluk Bayur",
                "Bakauheni",
                "Tanjung Emas",
                "Gilimanuk",
                "Jawaban yang benar adalah (B)")
        array.add(model)

        model = TryoutModel(
                4,
                4,
                "Di bawah ini yang merupakan pegunungan yang terletak di Pulau Jawa antara lain ....",
                "",
                "",
                "",
                0,
                false,
                "Pegunungan Sewu, Pegunungan Kendeng, dan Pegunungan Kapur Utara",
                "Pegunungan Sewu, Pegunungan Kendeng, dan Pegunungan Bukit Barisan",
                "Pegunungan Sewu, Pegunungan Bukit Barisan, dan Pegunungan Kapur Utara",
                "Pegunungan Sewu, Pegunungan Bukit Barisan, dan Pegunungan Muller",
                "Jawaban yang benar adalah (A)")
        array.add(model)

        model = TryoutModel(
                5,
                5,
                "Dimanakah ibukota Indonesia?",
                "",
                "",
                "",
                0,
                false,
                "Jakarta",
                "Surabaya",
                "Bandung",
                "Semarang",
                "Jawaban yang benar adalah (D)")
        array.add(model)

        model = TryoutModel(
                6,
                6,
                "Di wilayah Indonesia terdapat banyak gunung api yang masih aktif. salah satu contoh gunung api aktif di Indonesia yaitu Gunung Merapi. Gunung tersebut terletak di wilayah provinsi....",
                "",
                "",
                "",
                0,
                false,
                "DKI Jakarta dan Banten",
                "Jawa Tengah dan Daerah Istimewa Yogyakarta",
                "Jawa Timur dan Jawa Tengah",
                "Jawa Barat dan DKI Jakarta",
                "Jawaban yang benar adalah (A)")
        array.add(model)

        model = TryoutModel(
                7,
                7,
                "Candi Borobudur merupakan kenampakan buatan yang merupakan ikon dari provinsi ….",
                "",
                "",
                "",
                0,
                false,
                "Jawa Tengah",
                "DI Yogyakarta",
                "DKI Jakarta",
                "Jawa Barat",
                "Jawaban yang benar adalah (C)")
        array.add(model)

        model = TryoutModel(
                8,
                8,
                "Berikut merupakan kenampakan buatan di Papua, antara lain ….",
                "",
                "",
                "",
                0,
                false,
                "Stadion Mandala Krida, Taman Laut Raja Ampat, dan Tugu Pahlawan",
                "Stadion Gelora Sriwijaya, Mal Jayapura, dan Puncak Jaya",
                "Stadion Si Jalak Harupat, hamparan hutan bakau, dan Tol Trans Jayapura",
                "Stadion Mandala Jayapura, Bandara Wamena, dan Papua Trade Center",
                "Jawaban yang benar adalah (B)")
        array.add(model)

        model = TryoutModel(
                9,
                9,
                "Dimanakah ibukota Malaysia?",
                "",
                "",
                "",
                0,
                false,
                "Jakarta",
                "Kuala Lumpur",
                "Melayu",
                "Spain",
                "Jawaban yang benar adalah (B)")
        array.add(model)

        model = TryoutModel(
                10,
                10,
                "Apa nama pekerja saat penjajahan Belanda?",
                "",
                "",
                "",
                0,
                false,
                "Romusa",
                "Rodi",
                "Roda",
                "Saitama",
                "Jawaban yang benar adalah (A)")
        array.add(model)


        rv.apply {
            layoutManager = LinearLayoutManager(this@PembahasanToActivity, LinearLayoutManager.HORIZONTAL,false)
        }
        rv.adapter = adapter
        tv_soal.setText(array.get(0).soal)
        tv_opsiA.setText("A. " + array.get(0).pilihanA)
        tv_opsiB.setText("B. " + array.get(0).pilihanB)
        tv_opsiC.setText("C. " + array.get(0).pilihanC)
        tv_opsiD.setText("D. " + array.get(0).pilihanD)
        tv_pembahasan.setText(array.get(0).pembahasan)
    }

    override fun getPembahasan(pembahasan: String?) {
        tv_pembahasan.setText(pembahasan)
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
