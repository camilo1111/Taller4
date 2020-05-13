package com.uan.taller4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//creamos nuestra variable preference


        ImageBtnHomer.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 1)
            continueDetail.putExtra("name","Homer Simpson" )
            continueDetail.putExtra("photo","homer" )
            continueDetail.putExtra("description", "homer")
            startActivity(continueDetail)
            finish()


        }

        ImageBtnBart.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 2)
            continueDetail.putExtra("name","Bart Simpson" )
            continueDetail.putExtra("photo","bart" )
            continueDetail.putExtra("description", "bart")
            startActivity(continueDetail)
            finish()

        }

        ImageBtnMarge.setOnClickListener {
                val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 3)
                continueDetail.putExtra("name","Marge Simpson" )
                continueDetail.putExtra("photo","marge" )
                continueDetail.putExtra("description", "marge")

                startActivity(continueDetail)
                finish()
        }

        ImageBtnLisa.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 4)
            continueDetail.putExtra("name","Lisa Simpson" )
            continueDetail.putExtra("photo","lisa" )
            continueDetail.putExtra("description", "lisa")

            startActivity(continueDetail)
            finish()
        }

        ImageBtnMaggie.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 5)
            continueDetail.putExtra("name","Maggie Simpson" )
            continueDetail.putExtra("photo","maggie" )
            continueDetail.putExtra("description", "maggie")

            startActivity(continueDetail)
            finish()

        }

        ImageBtnAbraham.setOnClickListener {
            val continueDetail = Intent (this, DetailActivity::class.java)
            continueDetail.putExtra("id", 6)
            continueDetail.putExtra("name","Abraham Simpson" )
            continueDetail.putExtra("photo","abraham" )
            continueDetail.putExtra("description", "abraham")

            startActivity(continueDetail)
            finish()

        }

        //val contentRate= this.intent.extras
       // if(contentRate!= null){
         //   calificacion= contentRate.getFloat("rate")
           // mPreferences.setRate(calificacion)
        //}




    }
}
