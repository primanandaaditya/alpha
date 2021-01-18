package com.example.alpha.activities.to.analisa.detail

class DetailAnalisaToModel {
    var tipeSoal: String
    var jumlahBenar: Int
    var jumlahSoal: Int
    var nilaiAnda: Int
    var nilaiPurata: Int

    constructor(tipeSoal: String, jumlahBenar: Int, jumlahSoal: Int, nilaiAnda: Int, nilaiPurata: Int) {
        this.tipeSoal = tipeSoal
        this.jumlahBenar = jumlahBenar
        this.jumlahSoal = jumlahSoal
        this.nilaiAnda = nilaiAnda
        this.nilaiPurata = nilaiPurata
    }
}