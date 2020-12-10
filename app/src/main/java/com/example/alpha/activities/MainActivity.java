package com.example.alpha.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alpha.R;
import com.example.alpha.helper.BaseActivity;
import com.example.alpha.room.database.AppDatabase;
import com.example.alpha.room.user.AtAddUser;
import com.example.alpha.room.user.User;

public class MainActivity extends BaseActivity {

    TextView tv_login,tv_email,et_email,tv_password,et_password,tv_lupapassword,tv_belumpunya,tv_registrasi;
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();

    }

    void findId(){

        tv_login=findViewById(R.id.tv_login);
        tv_email=findViewById(R.id.tv_email);
        et_email=findViewById(R.id.et_email);
        tv_password=findViewById(R.id.tv_password);
        et_password=findViewById(R.id.et_password);
        tv_lupapassword=findViewById(R.id.tv_lupapassword);
        tv_belumpunya=findViewById(R.id.tv_belum_punya_akun);
        tv_registrasi=findViewById(R.id.tv_registrasi);
        btn_login=findViewById(R.id.btn_login);

        //set font
//        this.applyFontRegularToTextView(tv_login);
//        this.applyFontRegularToTextView(tv_email);
//        this.applyFontRegularToTextView(et_email);
//        this.applyFontRegularToTextView(et_password);
//        this.applyFontRegularToTextView(tv_lupapassword);
//        this.applyFontRegularToTextView(tv_belumpunya);
//        this.applyFontRegularToTextView(tv_registrasi);
//        this.applyFontRegularToTextView(btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, NavigasiActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tv_registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tv_lupapassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ResetPasswordActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
