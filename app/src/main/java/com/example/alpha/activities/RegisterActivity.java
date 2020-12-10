package com.example.alpha.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alpha.R;

public class RegisterActivity extends AppCompatActivity {

    TextView tv_nama, tv_password, tv_hp, tv_kampus_impian, tv_prodi_impian, tv_sekolah, tv_kelas, tv_konfirmasi_password;
    EditText et_nama, et_password, et_hp, et_kampus_impian, et_prodi_impian, et_sekolah, et_kelas, et_konfirmasi_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
