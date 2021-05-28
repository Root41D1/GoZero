package org.si.gozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import org.si.gozero.NavbarMenuActivity
import org.si.gozero.R
import org.si.gozero.database.Connector
import org.si.gozero.database.MasterUser
import org.si.gozero.ui.home.HomeFragment

class LoginActivity : AppCompatActivity() {

    companion object {
        private val CLASS_TAG = LoginActivity::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnmasuk.setOnClickListener {
            val isPassed = checkFields()
            
            if (isPassed) {
                val user = getUser()
                storeUser(user)
                moveToNextActivity()
            }
        }
    }

    private fun checkFields(): Boolean {
        if (usernik.text.isBlank()) {
            Toast.makeText(this, "Harap isi NIK Anda", Toast.LENGTH_LONG).show()
            return false
        }

        if (password.text.isBlank()) {
            Toast.makeText(this, "Harap isi password Anda", Toast.LENGTH_LONG).show()
            return false
        }

        return true
    }

    private fun getUser(): MasterUser {
        val user = MasterUser("90019081", "Dhana")
        return user
    }

    private fun storeUser(user: MasterUser) {
        val database = Connector.getDatabase(applicationContext)

        val userDao = database.userDao()
        userDao.insert(user)
    }

    private fun moveToNextActivity() {
        val mainActivity2 = Intent(this, MainActivity2::class.java)
        startActivity(mainActivity2)
    }

    override fun onResume() {
        super.onResume()

        val database = Connector.getDatabase(applicationContext)
        val userDao = database.userDao()

        if (userDao.isAnyUserStillLogin() > 0) {
            moveToNextActivity()
        }
    }

}