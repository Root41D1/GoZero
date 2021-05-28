package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "IUT")
@Parcelize
class MasterSite(
    @PrimaryKey val site_code: String,
    val nm_site: String,
    val company: String
)
    : Parcelable {

}