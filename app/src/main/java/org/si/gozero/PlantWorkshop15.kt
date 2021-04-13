package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop15)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral15)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop15,PlantWorkshop14::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext15)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop15,PlantWorkshop16::class.java))
        }
    }
}