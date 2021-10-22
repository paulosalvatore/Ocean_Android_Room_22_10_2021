package com.oceanbrasil.ocean_android_room_22_10_2021.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.oceanbrasil.ocean_android_room_22_10_2021.model.AppDatabase
import com.oceanbrasil.ocean_android_room_22_10_2021.model.PokemonDao
import com.oceanbrasil.ocean_android_room_22_10_2021.model.PokemonEntity

class PokemonViewModel(application: Application) : AndroidViewModel(application) {
    val pokemons: LiveData<List<PokemonEntity>>

    private val pokemonDao: PokemonDao

    init {
        val db = AppDatabase.getDatabase(application)

        pokemonDao = db.pokemonDao()

        pokemons = pokemonDao.findAll()
    }

    fun create(pokemon: PokemonEntity) {
        Thread {
            pokemonDao.create(pokemon)
        }.start()
    }
}
