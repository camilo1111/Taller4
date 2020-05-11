package com.uan.taller4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import java.util.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
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
