package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop23)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral23)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop23,PlantWorkshop22::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext23)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop23,PlantWorkshop24::class.java))
        }
    }
}