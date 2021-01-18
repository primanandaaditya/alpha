package com.example.alpha.activities.to.finish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.alpha.R
import com.example.alpha.activities.to.analisa.home.AnalisaToActivity
import com.example.alpha.activities.to.pembahasan.PembahasanToActivity

class FinishToActivity : AppCompatActivity() {

    private lateinit var btn_analisa: Button
    private lateinit var btn_pembahasan: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_to)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        findId()

    }

    fun findId(){

        btn_analisa=findViewById(R.id.btn_analisa)
        btn_pembahasan=findViewById(R.id.btn_pembahasan)

        btn_analisa.setOnClickListener(View.OnClickListener {
            var intent=Intent(this, AnalisaToActivity::class.java)
            startActivity(intent)
        })

        btn_pembahasan.setOnClickListener(View.OnClickListener {
            var intent= Intent(this, PembahasanToActivity::class.java)
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
