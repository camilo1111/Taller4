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
            val continueDetail = Intent(this, DetailActivity::class.java)
            continueDetail.putExtra("id", 1)
            continueDetail.putExtra("name", "Homer Simpson")
            continueDetail.putExtra("pd", "homer")
            startActivity(continueDetail)

        }

        ImageBtnBart.setOnClickListener {
            val continueDetail = Intent(this, DetailActivity::class.java)
            continueDetail.putExtra("id", 2)
            continueDetail.putExtra("name", "Bart Simpson")
            continueDetail.putExtra("pd", "bart")
            startActivity(continueDetail)

        }

        ImageBtnMarge.setOnClickListener {
            val continueDetail = Intent(this, DetailActivity::class.java)
            continueDetail.putExtra("id", 3)
            continueDetail.putExtra("name", "Marge Simpson")
            continueDetail.putExtra("pd", "marge")
            startActivity(continueDetail)

        }

        ImageBtnLisa.setOnClickListener {
            val continueDetail = Intent(this, DetailActivity::class.java)
            continueDetail.putExtra("id", 4)
            continueDetail.putExtra("name", "Lisa Simpson")
            continueDetail.putExtra("pd", "lisa")
            startActivity(continueDetail)

        }

        ImageBtnMaggie.setOnClickListener {
            val continueDetail = Intent(this, DetailActivity::class.java)
            continueDetail.putExtra("id", 5)
            continueDetail.putExtra("name", "Maggie Simpson")
            continueDetail.putExtra("pd", "maggie")
            startActivity(continueDetail)

        }

        ImageBtnAbraham.setOnClickListener {
            val continueDetail = Intent(this, DetailActivity::class.java)
            continueDetail.putExtra("id", 6)
            continueDetail.putExtra("name", "Abraham Simpson")
            continueDetail.putExtra("pd", "abraham")
            startActivity(continueDetail)

        }
    }

    fun PlayMusic() {
        var mediaPlayer: MediaPlayer? =
            MediaPlayer.create(this, R.raw.sound_file)
        mediaPlayer?.start()
    }
}
