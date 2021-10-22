package com.oceanbrasil.ocean_android_room_22_10_2021.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PokemonDao {
    @Query("SELECT * FROM pokemons")
    fun findAll(): LiveData<List<PokemonEntity>>

    @Insert
    fun create(pokemon: PokemonEntity)
}
