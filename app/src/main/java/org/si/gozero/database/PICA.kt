package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class   PICA(
        @PrimaryKey val id_pica: Int,
        val lokasi_area: String,
        val tanggal: Date,
        val kd_bahaya: String,
        val penyimpangan: String,
        val tindakan: String,
        val penyebab_deviasi: String,
        val batas_waktu: String,
        val Status: String
)
    : Parcelable {

}