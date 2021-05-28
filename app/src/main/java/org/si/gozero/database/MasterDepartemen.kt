package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class MasterDepartemen(
        @PrimaryKey val id_departemen: String,
        val nm_departemen: String
)
    : Parcelable {

}