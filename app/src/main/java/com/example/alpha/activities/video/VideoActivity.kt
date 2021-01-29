package com.example.alpha.activities.video

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.alpha.R

class VideoActivity : AppCompatActivity() {

    private lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);

        findID()
        generateData()

    }

    fun findID(){
        lv=findViewById(R.id.lv)

    }

    fun generateData(){
        var array=ArrayList<VideoModel>()
        var model: VideoModel

        model = VideoModel("Video Training Matematika", "1K views", "5 minutes ago","https://www.youtube.com/watch?v=Q6GgeafgRCk")
        array.add(model)

        model = VideoModel("Video Training Fisika", "2K views", "1 hour ago", "https://www.youtube.com/watch?v=5ikiX0gv5w4")
        array.add(model)

        model = VideoModel("Video Training Biologi", "1K views", "2 days ago","https://www.youtube.com/watch?v=JfB7Ug_nnJg")
        array.add(model)

        var adapter=VideoAdapter(this, array)
        lv.adapter = adapter

        lv.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val vm: VideoModel = parent.adapter.getItem(position) as VideoModel
            var intent= Intent(this, PlayVideoActivity::class.java)
            intent.putExtra("judul", vm.judul)
            intent.putExtra("view", vm.view)
            intent.putExtra("ago", vm.ago)
            intent.putExtra("url", vm.url)
            startActivity(intent)
        }

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
