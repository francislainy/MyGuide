package com.example.android.myguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_attractions);

        String[] top_attractions = new String[]{"one", "two", "three"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, top_attractions);

        ListView listView = (ListView) findViewById(R.id.list_view_top_attractions);
        listView.setAdapter(itemsAdapter);
    }

}
