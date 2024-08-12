package com.example.bhbusmetrop.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.bhbusmetrop.model.BusModel

@Dao
interface BusDao {

    @Insert
    fun insertOnibus(cartao: BusModel) : Long

    @Update
    fun UpdateOnibus(cartao: BusModel) : Int

    @Delete
    fun DeleteOnibus(cartao: BusModel) : Int

    @Query("SELECT * FROM Onibus Where id_onibus = :id")
    fun get(id: Int): BusModel

    @Query("SELECT * FROM Onibus")
    fun getAll():List<BusModel>


}
