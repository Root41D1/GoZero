package org.si.gozero.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.si.gozero.MainActivity
import org.si.gozero.PlantWorkshop
import org.si.gozero.PlantWorkshop1
import org.si.gozero.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(


            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        val imageView: ImageView = root.findViewById(R.id.generaal)
        val Gambar: ImageView = root.findViewById(R.id.gmbrlantnworksopp)
        imageView.setOnClickListener{
            val intent = Intent(getActivity(),MainActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        Gambar.setOnClickListener{
            val intent = Intent(getActivity(),PlantWorkshop::class.java)
            getActivity()?.startActivity(intent)
        }
        return root

    }

}