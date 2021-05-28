package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class   MasterLokasi(
        @PrimaryKey val id_lokasi: String,
        val nm_lokasi: String,
        val id_departemen: String
)
    : Parcelable {

}