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
    var pilihanA: String
    var pilihanB: String
    var pilihanC: String
    var pilihanD: String

    constructor(id: Int, nomor: Int, soal: String, jawaban: String, kunci: String, komponen: String, indeks_komponen: Int, aktiv: Boolean, pilihanA: String, pilihanB: String, pilihanC: String, pilihanD: String) {
        this.id = id
        this.nomor = nomor
        this.soal = soal
        this.jawaban = jawaban
        this.kunci = kunci
        this.komponen = komponen
        this.indeks_komponen = indeks_komponen
        this.aktiv = aktiv
        this.pilihanA = pilihanA
        this.pilihanB = pilihanB
        this.pilihanC = pilihanC
        this.pilihanD = pilihanD
    }
}