package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop22)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral22)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop22,PlantWorkshop21::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext22)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop22,PlantWorkshop23::class.java))
        }
    }
}