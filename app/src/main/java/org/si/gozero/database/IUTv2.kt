package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import org.w3c.dom.Text
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class   IUTv2(
        @PrimaryKey val id_iutv2: Int,
        val nm_site: Int,
        val id_soal: Int,
        val tanggal: Date,
        val NIK: String,
        val jawaban: String,
        val note: String
)
    : Parcelable {

}