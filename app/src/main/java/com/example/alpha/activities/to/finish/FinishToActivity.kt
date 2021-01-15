package com.example.alpha.activities.to.finish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alpha.R

class FinishToActivity : AppCompatActivity() {

    private lateinit var btn_analisa: Button
    private lateinit var btn_pembahasan: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_to)

        findId()

    }

    fun findId(){
        btn_analisa=findViewById(R.id.btn_analisa)
        btn_pembahasan=findViewById(R.id.btn_pembahasan)


    }
}
