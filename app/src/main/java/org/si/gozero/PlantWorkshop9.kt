package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop9)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral9)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop9,PlantWorkshop8::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext9)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop9,PlantWorkshop10::class.java))
        }
    }
}