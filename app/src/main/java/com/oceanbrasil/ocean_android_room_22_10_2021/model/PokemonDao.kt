package com.oceanbrasil.ocean_android_room_22_10_2021.model

import androidx.room.Dao
import androidx.room.Query

@Dao
interface PokemonDao {
    @Query("SELECT * FROM pokemons")
    fun findAll(): List<PokemonEntity>
}