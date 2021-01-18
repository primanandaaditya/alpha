package com.example.alpha.activities.to.analisa.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.alpha.R
import com.example.alpha.activities.to.analisa.detail.DetailAnalisaToActivity
import com.example.alpha.activities.to.pembahasan.PembahasanToActivity

class AnalisaToActivity : AppCompatActivity() {

    private lateinit var btn_analisis_grafik: Button
    private lateinit var btn_rincian_hasil: Button
    private lateinit var btn_pembahasan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analisa_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        findId()
    }

    fun findId(){
        btn_analisis_grafik=findViewById(R.id.btn_analisis_grafik)
        btn_pembahasan=findViewById(R.id.btn_pembahasan)
        btn_rincian_hasil=findViewById(R.id.btn_rincian_hasil)

        btn_pembahasan.setOnClickListener(View.OnClickListener {
            var intent=Intent(this, PembahasanToActivity::class.java)
            startActivity(intent)
        })

        btn_rincian_hasil.setOnClickListener(View.OnClickListener {
            var intent=Intent(this, DetailAnalisaToActivity::class.java)
            startActivity(intent)
        })

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
