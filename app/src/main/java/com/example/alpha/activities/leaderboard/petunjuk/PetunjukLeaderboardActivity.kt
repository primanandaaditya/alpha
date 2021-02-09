package com.example.alpha.activities.leaderboard.petunjuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.alpha.R

class PetunjukLeaderboardActivity : AppCompatActivity() {

    private lateinit var btn_tutup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petunjuk_leaderboard)

        findId()

    }

    fun findId(){
        btn_tutup=findViewById(R.id.btn_tutup)
        btn_tutup.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
