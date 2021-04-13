package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop17)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral17)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop17,PlantWorkshop16::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext17)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop17,PlantWorkshop18::class.java))
        }
    }
}