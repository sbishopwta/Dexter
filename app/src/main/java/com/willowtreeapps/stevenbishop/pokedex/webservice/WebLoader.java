package com.willowtreeapps.stevenbishop.pokedex.webservice;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import com.willowtreeapps.stevenbishop.pokedex.models.Pokedex;


/**
 * Created by stevenbishop on 11/23/15.
 */
public class WebLoader extends AsyncTaskLoader<Pokedex> {

    public WebLoader(Context context) {
        super(context);
    }

    @Override
    public Pokedex loadInBackground() {
        try {
            return Api.get().getPokedex().execute().body();
        } catch (Exception e) {
            Log.d("pokeedex", "load error", e);
            return null;
        }
    }

}
