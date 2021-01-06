package com.example.alpha.activities.bank_soal.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.alpha.R
import com.example.alpha.activities.bank_soal.detail.DetailBankSoalActivity
import com.example.alpha.activities.detail_tryout.DetailTryoutActivity

class ListBankSoalActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_bank_soal)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);


        findID()
    }

    fun findID(){

        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)

        btn1.setOnClickListener(View.OnClickListener {
            pindah()
        })

        btn2.setOnClickListener(View.OnClickListener {
            pindah()
        })

        btn3.setOnClickListener(View.OnClickListener {
            pindah()
        })

    }

    fun pindah(){
        var intent= Intent(this, DetailBankSoalActivity::class.java)
        startActivity(intent)
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
