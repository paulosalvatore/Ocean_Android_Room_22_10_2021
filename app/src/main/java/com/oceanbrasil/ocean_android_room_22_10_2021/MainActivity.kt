package com.oceanbrasil.ocean_android_room_22_10_2021

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.ocean_android_room_22_10_2021.viewmodel.PokemonViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonViewModel: PokemonViewModel =
            ViewModelProvider(this)
                .get(PokemonViewModel::class.java)

        val tvPokemons = findViewById<TextView>(R.id.tvPokemons)

        pokemonViewModel.pokemons.observe(this, {
            tvPokemons.text = ""

            it.forEach { pokemon ->
                tvPokemons.append("${pokemon.name}\n")
            }
        })
    }
}
