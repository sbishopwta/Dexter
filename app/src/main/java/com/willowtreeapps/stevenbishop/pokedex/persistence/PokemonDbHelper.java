package com.willowtreeapps.stevenbishop.pokedex.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.willowtreeapps.stevenbishop.pokedex.models.Pokemon;

/**
 * Created by stevenbishop on 12/13/15.
 */
public class PokemonDbHelper extends SQLiteOpenHelper {


    public static final String LOG_TAG = PokemonDbHelper.class.getSimpleName();

    //Database name
    public static final String DATABASE_NAME = PokemonContract.DATABASE_NAME;
    //Database  version
    public static final int DATABASE_VERSION = 1;

    //Pokemon Table
    public static final String POKEMON_TABLE_NAME = PokemonContract.Pokemon.TABLE_NAME;
    public static final String POKEMON_ROW_ID = PokemonContract.Pokemon.ID;
    public static final String POKEMON_ROW_NAME = PokemonContract.Pokemon.NAME;
    public static final String POKEMON_ROW_ATTACK = PokemonContract.Pokemon.ATTACK;
    public static final String POKEMON_ROW_DEFENSE = PokemonContract.Pokemon.DEFENSE;

    //SQL statement to create the Pokemon table
    public static final String POKEMON_TABLE_CREATE =
            "Create Table " + POKEMON_TABLE_NAME + " (" +
            POKEMON_ROW_ID +
            POKEMON_ROW_NAME +
            POKEMON_ROW_ATTACK +
            POKEMON_ROW_DEFENSE + " );";


    public PokemonDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(POKEMON_TABLE_CREATE);
        Log.i(LOG_TAG, "Creating table with query: " + POKEMON_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + POKEMON_TABLE_CREATE);
        onCreate(db);
    }

    void insertPokemon(Pokemon pokemon) {
        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(POKEMON_ROW_NAME, pokemon.getName());
        contentValues.put(POKEMON_ROW_ATTACK, pokemon.getAttack());
        contentValues.put(POKEMON_ROW_DEFENSE, pokemon.getDefense());

        database.insert(POKEMON_TABLE_NAME, null, contentValues);
        database.close();
    }
}
