package com.example.alpha.activities.video

class VideoModel {
    var judul: String
    var view: String
    var ago: String
    var url: String

    constructor(judul: String, view: String, ago: String, url: String) {
        this.judul = judul
        this.view = view
        this.ago = ago
        this.url = url
    }
}