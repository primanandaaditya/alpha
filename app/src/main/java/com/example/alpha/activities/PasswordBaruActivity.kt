package com.example.alpha.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.alpha.R

class PasswordBaruActivity : AppCompatActivity() {

    private lateinit var tv_lupa_password: TextView
    private lateinit var tv_kembali_login: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_baru)

        findID()
    }

    fun findID(){
        tv_lupa_password=findViewById(R.id.tv_lupapassword)
        tv_kembali_login=findViewById(R.id.tv_kembali_login)

        tv_lupa_password.setOnClickListener(View.OnClickListener {
            var intent= Intent(this, ResetPasswordActivity::class.java)
            startActivity(intent)
            finish()

        })

        tv_kembali_login.setOnClickListener(View.OnClickListener {
            var intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}
