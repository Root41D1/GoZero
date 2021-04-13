package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop4)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral4)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop4,PlantWorkshop3::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext4)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop4,PlantWorkshop5::class.java))
        }
    }
}