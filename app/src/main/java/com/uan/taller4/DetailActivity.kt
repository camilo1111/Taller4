package com.uan.taller4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*
import java.util.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val mPreferences = MyPreferences(this)
        val contentId= this.intent.extras

            val id = contentId?.getInt("id")

            if (id!=null){
                when (id) {
                    1 -> {
                        ratingBar.setRating(mPreferences.getRateHomer())
                    }
                    2 -> {
                        ratingBar.setRating(mPreferences.getRateBart())
                    }
                    3 -> {
                        ratingBar.setRating(mPreferences.getRateMarge())
                    }
                    4 -> {
                        ratingBar.setRating(mPreferences.getRateLisa())
                    }
                    5 -> {
                        ratingBar.setRating(mPreferences.getRateMaggie())
                    }
                    6 -> {
                        ratingBar.setRating(mPreferences.getRateAbraham())
                    }
                }
        }

        buttonVote.setOnClickListener {

            var calificacion = ratingBar.getRating()

                if (id != null) {
                    when (id) {
                        1 -> {
                            mPreferences.setRateHomer(calificacion)
                        }
                        2 -> {
                            mPreferences.setRateBart(calificacion)
                        }
                        3 -> {
                            mPreferences.setRateMarge(calificacion)
                        }
                        4 -> {
                            mPreferences.setRateLisa(calificacion)
                        }
                        5 -> {
                            mPreferences.setRateMaggie(calificacion)
                        }
                        6 -> {
                            mPreferences.setRateAbraham(calificacion)
                        }


                }
            }


            val ratingValue = ratingBar.rating
            Toast.makeText(this, "Rating is:"+ratingValue,Toast.LENGTH_LONG).show()
            finish()

        }






        setName()
        setPhoto()
        setDescription()


    }

    fun setName(){
        val contentName = this.intent.extras
        if (contentName != null){
            val titleName= contentName.getString("name")
            textViewName.setText(titleName)
        }
    }

    fun setPhoto(){
        val contentPhoto = this.intent.extras
        if (contentPhoto != null){
            val namePhoto =contentPhoto.getString("photo")
            val idImage = resources.getIdentifier(namePhoto,"drawable", packageName)
            imageViewPhoto.setImageResource(idImage)

        }

    }

    fun setDescription(){
        val contentDescription = this.intent.extras
        var characterDescription = ""
        if (contentDescription != null){
            val nameDescription =contentDescription.getString("description")
            val idDescription = resources.getIdentifier(nameDescription,"raw", packageName)

            val scanner = Scanner(resources.openRawResource(idDescription))
            while (scanner.hasNextLine()){
                val lineText = scanner.nextLine()
                characterDescription += lineText
            }
            textViewDescription.setText(characterDescription)
            scanner.close()

        }

    }

}
