package org.si.gozero

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0

    var SavedDay = 0
    var SavedMonth = 0
    var SavedYear = 0
    var SavedHour = 0
    var SavedMinute = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backbuttongeneral.setOnClickListener{
            val mainActivity2 = Intent(this, MainActivity2::class.java)
            startActivity(mainActivity2)
        }

        val kantorgudang = findViewById<TextView>(R.id.btnkantorgudang)
        kantorgudang.setOnClickListener{
            startActivity(Intent(this@MainActivity,KantorDanGudang::class.java))
        }

        val messdapur = findViewById<TextView>(R.id.btnmessdapur)
        messdapur.setOnClickListener{
            startActivity(Intent(this@MainActivity,MessDanDapur::class.java))
        }
        val pittambang = findViewById<TextView>(R.id.btnpittambang)
        pittambang.setOnClickListener{
            startActivity(Intent(this@MainActivity,PitMining::class.java))
        }
        val jlnangkut = findViewById<TextView>(R.id.btnjalanangkut)
        jlnangkut.setOnClickListener{
            startActivity(Intent(this@MainActivity,JalanAngkutBatubara::class.java))
        }
        val arealedak = findViewById<TextView>(R.id.btnarealedakduar)
        arealedak.setOnClickListener{
            startActivity(Intent(this@MainActivity,AreaPeledakan::class.java))
        }
        val mainfuel = findViewById<TextView>(R.id.btnmainfueltank)
        mainfuel.setOnClickListener{
            startActivity(Intent(this@MainActivity,MainFullTank::class.java))
        }

        pickDate()

    }

    private fun getDateTimeCalender() {
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)

    }




    private fun pickDate() {

        val btn = findViewById(R.id.buttondate) as EditText


        btn.setOnClickListener {
            getDateTimeCalender()

            DatePickerDialog(this, this, year,month,day).show()
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        SavedDay = dayOfMonth
        SavedMonth = month
        SavedYear = year

        getDateTimeCalender()
        TimePickerDialog(this, this, hour, minute, true).show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        SavedHour = hourOfDay
        SavedMinute = minute
        val texttt = findViewById(R.id.tv_texttime) as TextView


        texttt.text =  "$SavedDay-$SavedMonth-$SavedYear\n Hour: $SavedHour Minute: $SavedMinute"
    }

}