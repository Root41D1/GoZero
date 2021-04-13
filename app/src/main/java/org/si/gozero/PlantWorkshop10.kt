package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop10)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral10)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop10,PlantWorkshop9::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext10)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop10,PlantWorkshop11::class.java))
        }
    }
}