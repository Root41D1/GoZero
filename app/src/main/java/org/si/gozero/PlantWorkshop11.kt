package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop11)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral11)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop11,PlantWorkshop10::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext11)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop11,PlantWorkshop12::class.java))
        }
    }
}