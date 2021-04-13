package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CorrectiveInspection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corrective_inspection)

        val TextView = findViewById<TextView>(R.id.tombolcreate)
        TextView.setOnClickListener{
            startActivity(Intent(this@CorrectiveInspection,CorrectiveResult::class.java))
        }
    }
}