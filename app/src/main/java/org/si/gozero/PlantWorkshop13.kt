package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop13)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral13)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop13,PlantWorkshop12::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext13)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop13,PlantWorkshop14::class.java))
        }
    }
}