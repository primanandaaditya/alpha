package com.example.alpha.activities.to.screen

class TryoutModel {
    var id: Int
    var nomor: Int
    var soal: String
    var jawaban: String
    var kunci: String
    var komponen: String
    var indeks_komponen: Int
    var aktiv: Boolean

    constructor(id: Int, nomor: Int, soal: String, jawaban: String, kunci: String, komponen: String, indeks_komponen: Int, aktiv: Boolean) {
        this.id = id
        this.nomor = nomor
        this.soal = soal
        this.jawaban = jawaban
        this.kunci = kunci
        this.komponen = komponen
        this.indeks_komponen = indeks_komponen
        this.aktiv = aktiv
    }
}