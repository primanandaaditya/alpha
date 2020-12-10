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

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "hp")
    public String hp;

    @ColumnInfo(name = "kampus_impian")
    public String kampus_impian;

    @ColumnInfo(name = "prodi_impian")
    public String prodi_impian;

    @ColumnInfo(name = "sekolah")
    public String sekolah;

    @ColumnInfo(name = "kelas")
    public String kelas;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getKampus_impian() {
        return kampus_impian;
    }

    public void setKampus_impian(String kampus_impian) {
        this.kampus_impian = kampus_impian;
    }

    public String getProdi_impian() {
        return prodi_impian;
    }

    public void setProdi_impian(String prodi_impian) {
        this.prodi_impian = prodi_impian;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
