package com.example.alpha.activities.leaderboard.global

class LeaderboardGlobalModel {

    var ranking: Int
    var nama: String
    var nilai: Int
    var mapel: String
    var tanggal: String

    constructor(ranking: Int, nama: String, nilai: Int, mapel: String, tanggal: String) {
        this.ranking = ranking
        this.nama = nama
        this.nilai = nilai
        this.mapel = mapel
        this.tanggal = tanggal
    }
}