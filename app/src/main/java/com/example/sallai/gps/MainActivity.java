package com.example.sallai.gps;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sallai on 26.02.2018.
 */

public class MainActivity extends AppCompatActivity{
    ListView lv;
    ArrayList eintraege = new ArrayList();
    Locations l = new Locations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list);

        displayItems(eintraege);
        loadData();
    }

    private void loadData() {
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor rows = db.rawQuery("select Longitude, Latitude, Mydate from Location", null);
        while (rows.moveToNext()) {
            String lo = rows.getString(0);
            String la = rows.getString(1);
            String my = rows.getString(2);
            l.setLo(lo);
            l.setLa(la);
            l.setMy(my);
            eintraege.add(l);

        }

        rows.close();
        db.close();
    }

    private void displayItems(ArrayList a) {
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,a);
        lv.setAdapter(adapter);
    }
}
