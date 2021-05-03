package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class IUT(
    @PrimaryKey val id_iut: Int,
    val tanggal: Date,
    val nilai: Int,
    val id_soal: Int,
    val NIK: String
)
    : Parcelable {

}