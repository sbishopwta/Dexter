package com.willowtreeapps.stevenbishop.pokedex;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.willowtreeapps.stevenbishop.pokedex.models.Pokemon;

import org.w3c.dom.Text;

/**
 * Created by stevenbishop on 11/19/15.
 */

public class AllPokemonViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;
//    protected ImageView pokemonImageView;
    protected TextView type1TextView;
    protected TextView type2TextView;
    protected RelativeLayout allPokemonRelativeLayout;

    public AllPokemonViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.pokemonName);
        type1TextView = (TextView) itemView.findViewById(R.id.type1TextView);
        type2TextView = (TextView) itemView.findViewById(R.id.type2TextView);
        allPokemonRelativeLayout = (RelativeLayout) itemView.findViewById(R.id.allPokemonRelativeLayout);
    }

    public void setContent(Pokemon pokemon) {
        itemView.getContext();
        textView.setText(pokemon.name);
        allPokemonRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(itemView.getContext(), PokemonDetail.class);
                itemView.getContext().startActivity(detailIntent);
            }
        });
    }
}