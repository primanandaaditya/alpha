package com.example.alpha.room.user;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {


    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "nama")
    public String nama;

    @ColumnInfo(name = "password")
    public String password;



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
