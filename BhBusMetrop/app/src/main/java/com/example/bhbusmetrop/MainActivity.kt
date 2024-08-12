package com.example.bhbusmetrop.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bhbusmetrop.R
import com.example.bhbusmetrop.repository.AppDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val AppDatabase = AppDatabase.getDataBase(this).BusDao()

        val retornoInsert = AppDatabase.insertOnibus(BusModel().apply {
            this.nome = "Grajau"
            this.numero = "2101"
            this.tipo = "Ônibus"
            this.cor = "Vermelho"
            this.peso = "16t"
        })

        val retornoSelectMultiplo = AppDatabase.getAll()

        for (item in retornoSelectMultiplo) {
            Log.d(
                "Retorno",
                "id_onibus: ${item.id_onibus}, nome: ${item.nome}, numero: ${item.numero}, tipo: ${item.tipo}, cor: ${item.cor}, peso: ${item.peso}"
            )
        }
    }
}

