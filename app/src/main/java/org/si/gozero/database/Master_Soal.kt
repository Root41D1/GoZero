package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import org.w3c.dom.Text
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class   Master_Soal(
        @PrimaryKey val id_soal: Int,
        val soal: Text,
        val no_soal: Int,
        val id_lokasi: String,
        val jenis_soal: Int
)
    : Parcelable {

}