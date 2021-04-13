package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlantWorkshop3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop3)

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral3)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop3,PlantWorkshop2::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext3)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop3,PlantWorkshop4::class.java))
        }
    }
}