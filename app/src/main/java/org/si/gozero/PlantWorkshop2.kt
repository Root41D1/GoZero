package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop2)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral2)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop2,PlantWorkshop1::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext2)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop2,PlantWorkshop3::class.java))
        }
    }
}