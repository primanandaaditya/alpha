package com.example.alpha.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.alpha.R;
import com.example.alpha.room.database.AppDatabase;
import com.example.alpha.room.user.AtAddUser;
import com.example.alpha.room.user.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AtAddUser atAddUser=new AtAddUser(this);
        atAddUser.execute();


    }
}
