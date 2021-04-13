package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import org.si.gozero.ui.home.HomeFragment

class CorrectiveResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corrective_result)

        showDialog()

    }

    private fun showDialog() {
            val submitt = findViewById(R.id.submittt) as TextView

            submitt.setOnClickListener {

                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialogLayout = inflater.inflate(R.layout.dialogcorrective, null)

                with(builder) {
                    setView(dialogLayout)
                    show()
                }
            }
        }
}