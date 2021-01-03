package com.example.alpha.activities.askgram

import android.Manifest
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import com.example.alpha.R
import android.Manifest.permission
import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.Manifest.permission.WRITE_EXTERNAL_STORAGE
import android.Manifest.permission.WRITE_CONTACTS
import android.Manifest.permission.READ_CONTACTS
import android.app.Activity
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.content.Context
import android.net.Uri


class AddPostActivity : AppCompatActivity() {

    private lateinit var iv: ImageView
    private lateinit var iv_kamera: ImageView
    private lateinit var iv_galeri: ImageView
    private lateinit var iv_mic: ImageView

    val REQUEST_IMAGE_CAPTURE = 1
    var PERMISSION_ALL = 1
    private val pickImage = 100
    private var imageUri: Uri? = null


    private var PERMISSIONS = arrayOf<String>(Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.CAMERA)

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            // display error state to the user
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_post)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        if(!hasPermissions(this, *PERMISSIONS)){
            ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
        }

        findid()

    }

    fun hasPermissions(context: Context?, vararg permissions: String): Boolean {
        if (context != null && permissions != null) {
            for (permission in permissions) {
                if (ActivityCompat.checkSelfPermission(context!!, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false
                }
            }
        }
        return true
    }

    fun findid(){
        iv=findViewById(R.id.iv)
        iv_kamera=findViewById(R.id.iv_kamera)
        iv_galeri=findViewById(R.id.iv_galeri)
        iv_mic = findViewById(R.id.iv_mic)

        iv_kamera.setOnClickListener(View.OnClickListener {
            dispatchTakePictureIntent()
        })

        iv_galeri.setOnClickListener(View.OnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            iv.setImageBitmap(imageBitmap)
        }else if (requestCode == pickImage && resultCode == Activity.RESULT_OK){
            imageUri = data?.data
            iv.setImageURI(imageUri)
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
