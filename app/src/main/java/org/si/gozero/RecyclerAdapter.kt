package org.si.gozero

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    val fname = arrayOf("General","Corrective","plant and workshop", "general" , "general", "plant and workshop")
    val description = arrayOf("Kantor & Gudang", "Mess & Dapur", "Plant & Workshop", "Plant & Workshop" , "Mess & Dapur", "Kantor & Gudang")
    val date = arrayOf("14/07/2020", "28/03/2021", "26/03/2021", "26/03/2021", "28/03/2021", "14/07/2020")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var fname : TextView
        var description : TextView
        var date : TextView
        
        init {
            fname = itemView.findViewById(R.id.type)
            description = itemView.findViewById(R.id.inspeksi)
            date = itemView.findViewById(R.id.tanggal)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layouthistory,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fname.text = fname[position]
        holder.description.text = description[position]
        holder.date.text = date[position]
    }

    override fun getItemCount(): Int {
        return fname.size
    }
}