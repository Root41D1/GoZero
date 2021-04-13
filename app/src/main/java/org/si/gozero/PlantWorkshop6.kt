package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop6)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral6)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop6,PlantWorkshop5::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext6)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop6,PlantWorkshop7::class.java))
        }
    }
}