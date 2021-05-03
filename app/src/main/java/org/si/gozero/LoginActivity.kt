package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*
import org.si.gozero.NavbarMenuActivity
import org.si.gozero.R
import org.si.gozero.ui.home.HomeFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnmasuk.setOnClickListener {
            val mainActivity2 = Intent(this, MainActivity2::class.java)
            startActivity(mainActivity2)
        }
    }

}