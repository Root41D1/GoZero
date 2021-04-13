package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop18)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral18)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop18,PlantWorkshop17::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext18)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop18,PlantWorkshop19::class.java))
        }
    }
}