package com.example.alpha.activities.video

import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.alpha.R
import kotlinx.android.synthetic.main.activity_record_audio.view.*

class PlayVideoActivity : AppCompatActivity() {

    private lateinit var vv: VideoView
    private lateinit var tv_judul: TextView
    private lateinit var tv_view: TextView
    private lateinit var tv_ago: TextView
    private lateinit var btn_play: ImageView
    private lateinit var btn_pause: ImageView
    private lateinit var btn_stop: ImageView

    var judul: String?=""
    var view: String?=""
    var ago: String?=""
    var url: String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_video)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        findId()
    }

    fun findId(){

        vv=findViewById(R.id.vv)

        tv_judul=findViewById(R.id.tv_judul)
        tv_view=findViewById(R.id.tv_view)
        tv_ago=findViewById(R.id.tv_ago)
        btn_pause=findViewById(R.id.btn_pause)
        btn_play=findViewById(R.id.btn_play)
        btn_stop=findViewById(R.id.btn_stop)



        var intent=intent
        judul=intent.getStringExtra("judul")
        view=intent.getStringExtra("view")
        ago=intent.getStringExtra("ago")
        url=intent.getStringExtra("url")

        tv_judul.setText(judul)
        tv_view.setText(view)
        tv_ago.setText(ago)

        val uri: Uri = Uri.parse("https://www.sample-videos.com/video123/mp4/480/big_buck_bunny_480p_30mb.mp4")
        vv.setVideoURI(uri)
        vv.start()

        btn_pause.setOnClickListener(View.OnClickListener {
            vv.pause()
        })

        btn_stop.setOnClickListener(View.OnClickListener {
            vv.stop
        })

        btn_play.setOnClickListener(View.OnClickListener {
            vv.play
        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //jika tombol back ditekan oleh user

        val id = item.itemId
        when (id) {
            // Respond to the action bar's Up/Home button
            android.R.id.home -> {
                //NavUtils.navigateUpFromSameTask(this);
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)


    }
}
