package com.willowtreeapps.stevenbishop.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.willowtreeapps.stevenbishop.pokedex.models.Pokemon;
import com.willowtreeapps.stevenbishop.pokedex.PokemonDetail;

/**
 * Created by stevenbishop on 11/19/15.
 */

public class AllPokemonAdapter extends RecyclerView.Adapter< AllPokemonViewHolder> {

    public Pokemon[] allPokemon = new Pokemon[0];
    private Context mContext;
    @Override
    public AllPokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        mContext = context;
        View pokemonItemView = LayoutInflater.from(context).inflate(R.layout.item_pokemon, parent, false);

        return new AllPokemonViewHolder(pokemonItemView);
    }

    @Override
    public void onBindViewHolder(final AllPokemonViewHolder holder, int position) {
        holder.setContent(allPokemon[position]);
    }

    @Override
    public int getItemCount() {
        return allPokemon.length;
    }
}
