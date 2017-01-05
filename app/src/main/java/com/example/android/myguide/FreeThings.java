package com.example.android.myguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FreeThings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_main_layout);

        String[] free_things = new String[]{"Victoria And Albert Museum", "Natural History Museum",
                    "Queen's Guard", "Hide Park", "British Museum"};
        int[] image_free_things = new int[]{R.drawable.category_free_things_victoria_and_albert_museum,
                    R.drawable.category_free_things_natural_museum, R.drawable.category_free_things_queens_guard,
                    R.drawable.category_free_things_hide_park,
                    R.drawable.category_free_things_british_museum};

        ArrayList<Suggestion> suggestions_list = new ArrayList<Suggestion>();

        for(int i=0; i<free_things.length; i++) {
            suggestions_list.add(new Suggestion(free_things[i], image_free_things[i]));
        }

        SuggestionAdapter itemsAdapter = new SuggestionAdapter(this, suggestions_list);

        ListView listView = (ListView) findViewById(R.id.list_view_main);
        listView.setAdapter(itemsAdapter);
    }

}
