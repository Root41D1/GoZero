package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop14)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral14)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop14,PlantWorkshop13::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext14)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop14,PlantWorkshop15::class.java))
        }
    }
}