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
import android.os.CountDownTimer
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.content.DialogInterface
import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import androidx.appcompat.app.AlertDialog
import com.example.alpha.activities.to.finish.FinishToActivity


class TryoutScreenActivity : AppCompatActivity(), ITryout {


    var array=ArrayList<TryoutModel>()
    var adapter=RVTryoutAdapter(array, this, this)

    private lateinit var rv: RecyclerView
    private lateinit var btnA: Button
    private lateinit var btnB: Button
    private lateinit var btnC: Button
    private lateinit var btnD: Button
    private lateinit var btn_akhiri: Button
    private lateinit var tv_soal: TextView
    private lateinit var tv_opsiA: TextView
    private lateinit var tv_opsiB: TextView
    private lateinit var tv_opsiC: TextView
    private lateinit var tv_opsiD: TextView
    private lateinit var tv_waktu: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tryout_screen)

        findID()
        buatSoal()

        //mulai waktu count down
        object : CountDownTimer(600000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                tv_waktu.setText(formatMilliSecondsToTime(millisUntilFinished))
            }

            override fun onFinish() {
                tv_waktu.setText("done!")
            }
        }.start()

    }

    private fun formatMilliSecondsToTime(milliseconds: Long): String {

        val seconds = (milliseconds / 1000).toInt() % 60
        val minutes = (milliseconds / (1000 * 60) % 60).toInt()
        val hours = (milliseconds / (1000 * 60 * 60) % 24).toInt()
        return (twoDigitString(hours.toLong()) + " : " + twoDigitString(minutes.toLong()) + " : "
                + twoDigitString(seconds.toLong()))
    }

    private fun twoDigitString(number: Long): String {

        if (number == 0L) {
            return "00"
        }

        return if (number / 10 == 0L) {
            "0$number"
        } else number.toString()

    }

    fun findID(){

        tv_soal=findViewById(R.id.tv_soal)
        tv_waktu=findViewById(R.id.tv_waktu)
        tv_opsiA=findViewById(R.id.tv_opsiA)
        tv_opsiB=findViewById(R.id.tv_opsiB)
        tv_opsiC=findViewById(R.id.tv_opsiC)
        tv_opsiD=findViewById(R.id.tv_opsiD)

        rv=findViewById(R.id.rv)

        btn_akhiri=findViewById(R.id.btn_akhiri)
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

        btn_akhiri.setOnClickListener(View.OnClickListener {
            val dialogClickListener = DialogInterface.OnClickListener { dialog, which ->
                when (which) {
                    DialogInterface.BUTTON_POSITIVE -> {
                        var intent = Intent(this, FinishToActivity::class.java)
                        startActivity(intent)
                        finish()
                    }

                    DialogInterface.BUTTON_NEGATIVE -> {

                    }
                }//Yes button clicked
                //No button clicked
            }

            val builder = AlertDialog.Builder(this)
            builder.setMessage("Akhiri tryout ini?").setPositiveButton("Ya", dialogClickListener)
                    .setNegativeButton("Tidak", dialogClickListener).show()
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
                "")
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
                "")
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
                "")
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
                "")
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
                "")
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
                "")
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
                "")
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
                "")
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
                "")
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
                "")
        array.add(model)


        rv.apply {
            layoutManager = LinearLayoutManager(this@TryoutScreenActivity,LinearLayoutManager.HORIZONTAL,false)
        }
        rv.adapter = adapter
        tv_soal.setText(array.get(0).soal)
        tv_opsiA.setText("A. " + array.get(0).pilihanA)
        tv_opsiB.setText("B. " + array.get(0).pilihanB)
        tv_opsiC.setText("C. " + array.get(0).pilihanC)
        tv_opsiD.setText("D. " + array.get(0).pilihanD)
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

    override fun getPembahasan(pembahasan: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
