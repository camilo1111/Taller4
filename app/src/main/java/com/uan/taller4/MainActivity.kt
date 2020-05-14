package com.uan.taller4

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PlayMusic()

        ImageBtnHomer.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 1)
            continueDetail.putExtra("name","Homer Simpson" )
            continueDetail.putExtra("photo","homer" )
            continueDetail.putExtra("description", "homer")
            startActivity(continueDetail)



        }

        ImageBtnBart.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 2)
            continueDetail.putExtra("name","Bart Simpson" )
            continueDetail.putExtra("photo","bart" )
            continueDetail.putExtra("description", "bart")
            startActivity(continueDetail)


        }

        ImageBtnMarge.setOnClickListener {
                val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 3)
                continueDetail.putExtra("name","Marge Simpson" )
                continueDetail.putExtra("photo","marge" )
                continueDetail.putExtra("description", "marge")

                startActivity(continueDetail)

        }

        ImageBtnLisa.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 4)
            continueDetail.putExtra("name","Lisa Simpson" )
            continueDetail.putExtra("photo","lisa" )
            continueDetail.putExtra("description", "lisa")

            startActivity(continueDetail)

        }

        ImageBtnMaggie.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 5)
            continueDetail.putExtra("name","Maggie Simpson" )
            continueDetail.putExtra("photo","maggie" )
            continueDetail.putExtra("description", "maggie")

            startActivity(continueDetail)


        }

        ImageBtnAbraham.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 6)
            continueDetail.putExtra("name","Abraham Simpson" )
            continueDetail.putExtra("photo","abraham" )
            continueDetail.putExtra("description", "abraham")

            startActivity(continueDetail)


        }


    }

    fun PlayMusic(){
        var mediaPlayer: MediaPlayer? =
            MediaPlayer.create(this, R.raw.sound_file)
        mediaPlayer?.start()
    }
}
