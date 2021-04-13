package org.si.gozero

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class History : AppCompatActivity() {

    lateinit var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
    lateinit var layoutManager : RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter

        val spinner= findViewById<Spinner>(R.id.sortby) as Spinner
        val sort= arrayOf("All","General","Corrective","PlantWorkshop")
        val adapter=ArrayAdapter(this@History,android.R.layout.simple_spinner_dropdown_item,sort)

        spinner.adapter=adapter


        spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p3: Int, p4: Long) {

                Toast.makeText(this@History,"You have Selected "+sort[p3],Toast.LENGTH_LONG).show()

            }

        }



    }
}
