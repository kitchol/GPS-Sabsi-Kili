package com.example.sallai.gps;

import android.app.ListActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list);
        eintraege.add("Eintrag 1");
        eintraege.add("Eintrag 2");
        eintraege.add("Eintrag 3");

        displayItems(eintraege);
    }

    private void displayItems(ArrayList a) {
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,a);
        lv.setAdapter(adapter);
    }
}
