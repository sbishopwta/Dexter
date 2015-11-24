package com.willowtreeapps.stevenbishop.pokedex;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by stevenbishop on 11/19/15.
 */

public class AllPokemonViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;
//    protected ImageView pokemonImageView;
//    protected TextView type1TextView;
//    protected TextView type2TextView;


    public AllPokemonViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.pokemonName);
    }
}