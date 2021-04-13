package org.si.gozero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import org.si.gozero.R

class MessDanDapur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess_dan_dapur)

        showDialog()
    }

    private fun showDialog() {
        val doneemessdapoer = findViewById(R.id.donemess) as TextView

        doneemessdapoer.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.hasil_mess_dapoer, null)

            with(builder) {
                setView(dialogLayout)
                show()
            }
        }
    }
}