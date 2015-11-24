package com.willowtreeapps.stevenbishop.pokedex.webservice;

import com.willowtreeapps.stevenbishop.pokedex.Pokedex;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;

/**
 * Created by stevenbishop on 11/23/15.
 */
public final class Api {

    public static final String baseUrl = "http://pokeapi.co/api/v1/";

    static {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        sInstance = retrofit.create(PokemonService.class);
    }

    public static final String pokedexURI = "pokedex/1/";
    private static PokemonService sInstance;

    public static PokemonService get() { return sInstance;}

    public interface PokemonService {
        @GET(pokedexURI)
        Call<Pokedex> getPokedex();
    }

}
