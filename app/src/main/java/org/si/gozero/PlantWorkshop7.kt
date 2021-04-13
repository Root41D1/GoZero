package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop7)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral7)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop7,PlantWorkshop6::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext7)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop7,PlantWorkshop8::class.java))
        }
    }
}