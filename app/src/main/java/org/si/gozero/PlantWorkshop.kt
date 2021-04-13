package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlantWorkshop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop)

        val TextView = findViewById<TextView>(R.id.getstartedbtn)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop,PlantWorkshop1::class.java))
        }
    }
}