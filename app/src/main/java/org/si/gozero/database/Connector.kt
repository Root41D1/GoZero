package org.si.gozero.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class Connector : RoomDatabase() {
    companion object {
        // Singleton prevents multiple instances of database opening at the same time
        @Volatile
        private var INSTANCE: Connector? = null

        fun getDatabase(context: Context): Connector {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        Connector::class.java,
                        "db_Hpu_GoZero"
                )
                        .allowMainThreadQueries()           // allows Room to executing task in main thread
                        .fallbackToDestructiveMigration()   // allows Room to recreate database if no migrations found
                        .build()

                INSTANCE = instance

                // return instance
                instance
            }
        }
    }

    abstract fun iutDao(): IUT_DAO
}