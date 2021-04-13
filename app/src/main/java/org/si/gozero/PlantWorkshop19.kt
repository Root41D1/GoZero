package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop19)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral19)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop19,PlantWorkshop18::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext19)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop19,PlantWorkshop20::class.java))
        }
    }
}