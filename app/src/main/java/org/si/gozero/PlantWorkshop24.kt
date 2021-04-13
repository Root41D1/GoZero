package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop24)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral24)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop24,PlantWorkshop23::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext24)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop24,PlantWorkshop25::class.java))
        }
    }
}