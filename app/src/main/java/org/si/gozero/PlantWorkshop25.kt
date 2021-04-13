package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class PlantWorkshop25 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop25)

        showEditTextDialog()

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral25)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop25,PlantWorkshop24::class.java))
        }
    }

    private fun showEditTextDialog() {
        val btn_selesai = findViewById(R.id.btnselesai) as TextView

        btn_selesai.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.hasil_plantworkshop, null)

            with(builder) {
                setView(dialogLayout)
                show()


            }
        }
    }
}