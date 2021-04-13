package org.si.gozero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import org.si.gozero.R

class KantorDanGudang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kantor_dan_gudang)

        showDialog()

    }

    private fun showDialog() {
        val done = findViewById(R.id.cekpoint) as TextView

        done.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.activity_check_point, null)

            with(builder) {
                setView(dialogLayout)
                show()
            }
        }
    }


}