package com.example.alpha.activities.leaderboard.detail

class DetailLeaderboardModel {

    var ranking: Int
    var nama: String
    var nilai: Int

    constructor(ranking: Int, nama: String, nilai: Int) {
        this.ranking = ranking
        this.nama = nama
        this.nilai = nilai
    }
}