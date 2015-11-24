package com.willowtreeapps.stevenbishop.pokedex;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.willowtreeapps.stevenbishop.pokedex.webservice.WebLoader;

import java.lang.reflect.Array;

public class AllPokemon extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Pokedex> {

    private AllPokemonAdapter pokemonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_pokemon);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.allPokemonRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AllPokemonAdapter allPokemonAdapter = new AllPokemonAdapter();
        pokemonAdapter = allPokemonAdapter;

//        allPokemonAdapter.allPokemon = createPokemonListWithCount(100);
        recyclerView.setAdapter(allPokemonAdapter);

        getSupportLoaderManager().initLoader(0, null, this).forceLoad();
    }

    @Override
    public Loader<Pokedex> onCreateLoader(int id, Bundle args) {

        if (id == 0) {
            return new WebLoader(this);
        }
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Pokedex> loader, Pokedex data) {
//        Log.d("pokeedex", "load finished");
        Pokemon[] pokemonArray = new Pokemon[data.pokemon.size()];
        pokemonArray = data.pokemon.toArray(pokemonArray);
        pokemonAdapter.allPokemon = pokemonArray;
        pokemonAdapter.notifyDataSetChanged();
    }

    @Override
    public void onLoaderReset(Loader<Pokedex> loader) {

    }



}
