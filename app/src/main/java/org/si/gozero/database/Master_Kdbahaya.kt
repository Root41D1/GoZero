package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class   Master_Kdbahaya(
        @PrimaryKey val kd_bahaya: String,
        val nm_kd: String
)
    : Parcelable {

}