package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop21)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral21)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop21,PlantWorkshop20::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext21)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop21,PlantWorkshop22::class.java))
        }
    }
}