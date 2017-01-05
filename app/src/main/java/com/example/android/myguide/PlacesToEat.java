package com.example.android.myguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesToEat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_main_layout);

        String[] places_to_eat = new String[]{"Chettinad", "Floria",
                "Puccinella", "Teriaki", "Tortilla"};
        int[] image = new int[]{R.drawable.category_places_to_eat_chettinad,
                R.drawable.category_places_to_eat_floria, R.drawable.category_places_to_eat_puccinella,
                R.drawable.category_places_to_eat_teriaki,
                R.drawable.category_places_to_eat_tortilla};

        ArrayList<Suggestion> suggestions_list = new ArrayList<Suggestion>();

        for(int i=0; i<places_to_eat.length; i++) {
            suggestions_list.add(new Suggestion(places_to_eat[i], image[i]));
        }

        SuggestionAdapter itemsAdapter = new SuggestionAdapter(this, suggestions_list);

        ListView listView = (ListView) findViewById(R.id.list_view_main);
        listView.setAdapter(itemsAdapter);
    }

}
