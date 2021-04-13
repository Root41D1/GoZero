package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop20)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral20)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop20,PlantWorkshop19::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext20)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop20,PlantWorkshop21::class.java))
        }
    }
}