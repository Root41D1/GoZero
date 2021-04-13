package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop16)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral16)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop16,PlantWorkshop15::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext16)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop16,PlantWorkshop17::class.java))
        }
    }
}