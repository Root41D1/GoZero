package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop8)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral8)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop8,PlantWorkshop7::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext8)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop8,PlantWorkshop9::class.java))
        }
    }
}