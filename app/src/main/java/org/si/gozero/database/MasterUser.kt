package org.si.gozero.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "m_user")
@Parcelize
class MasterUser(
    @PrimaryKey(autoGenerate = false) val userNik : String,
    val userName : String
) : Parcelable {
}