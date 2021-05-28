package org.si.gozero.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MasterUserDao {
    @Insert()
    fun insert(user: MasterUser)

    @Query("SELECT COUNT(userNik) FROM m_user")
    fun isAnyUserStillLogin(): Int
}