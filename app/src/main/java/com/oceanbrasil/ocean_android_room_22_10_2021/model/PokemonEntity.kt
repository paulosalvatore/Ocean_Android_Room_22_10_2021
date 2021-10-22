package com.oceanbrasil.ocean_android_room_22_10_2021.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemons")
data class PokemonEntity(
    @PrimaryKey
    val id: Long,

    val name: String,

    val imageUrl: String
)
