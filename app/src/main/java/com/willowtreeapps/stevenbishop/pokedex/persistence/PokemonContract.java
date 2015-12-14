package com.willowtreeapps.stevenbishop.pokedex.persistence;

import android.provider.BaseColumns;

/**
 * Created by stevenbishop on 12/13/15.
 */
public class PokemonContract implements BaseColumns {
    public static final String DATABASE_NAME = "android-release.db";

    //Define the Pokemon table

    public static final class Pokemon {
        //Define the table name
        public static final String TABLE_NAME = "pokemon";
        public static final String ID = BaseColumns._ID;
        public static final String NAME = "name";
        public static final String ATTACK = "attack";
        public static final String DEFENCE = "defence";

        //Define projection for Pokemon table
        public static final String[] PROJECTION = new String[] {
                    Pokemon.NAME,
                    Pokemon.ATTACK,
                    Pokemon.DEFENCE
        };
    }
}
