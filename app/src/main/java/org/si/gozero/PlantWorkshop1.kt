package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class PlantWorkshop1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_workshop1)

        showEditTextDialog()

        val ImageView = findViewById<ImageView>(R.id.backbuttongeneral)
        ImageView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop1,PlantWorkshop::class.java))
        }

        val TextView = findViewById<TextView>(R.id.btnnext1)
        TextView.setOnClickListener{
            startActivity(Intent(this@PlantWorkshop1,PlantWorkshop2::class.java))
        }
        }

    private fun showEditTextDialog() {
        val notee = findViewById(R.id.note) as TextView

        notee.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.hasil_plantworkshop, null)

            with(builder) {
                setNegativeButton("Cancel") { dialog, which ->
                    Log.d("Main", "Negative Button Clicked")
                }

                setView(dialogLayout)
                show()


            }
        }
    }
}
