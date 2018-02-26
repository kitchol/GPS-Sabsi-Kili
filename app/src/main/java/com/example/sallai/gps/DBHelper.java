package com.example.sallai.gps;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sallai on 26.02.2018.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "persons.db";
    private static final int DB_version = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LocationSQL.SQL_CreateLocation);
    }

    public void onUpgrade(SQLiteDatabase db, int i, int ii) {
        db.execSQL(LocationSQL.SQL_DropLocation);
        db.execSQL(LocationSQL.SQL_CreateLocation);
        db.execSQL(LocationSQL.SQL_InsertLocation, new String[]{"38","-123","19.11.2016"});
    }
}
