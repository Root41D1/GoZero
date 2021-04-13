package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop12)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral12)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop12,PlantWorkshop11::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext12)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop12,PlantWorkshop13::class.java))
        }
    }
}