package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "Master_Site")
@Parcelize
class Master_Employee(
    @PrimaryKey val NIK: String,
    val nm_karyawan: String,
    val id_departemen: String,
    val site_code: String
)
    : Parcelable {

}