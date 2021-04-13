package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop5)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral5)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop5,PlantWorkshop4::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext5)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop5,PlantWorkshop6::class.java))
        }
    }
}