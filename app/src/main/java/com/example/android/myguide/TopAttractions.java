package com.example.android.myguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_main_layout);

        String[] top_attractions = new String[]{"London Tower", "Big Ben", "London Eye", "Buckingham Palace", "Hide Park"};
        int[] image = new int[]{R.drawable.london_tower, R.drawable.london_big_ben,
                    R.drawable.london_eye, R.drawable.buckingham_palace, R.drawable.hide_park};

        ArrayList<Suggestion> suggestions_list = new ArrayList<Suggestion>();

        for(int i=0; i<top_attractions.length; i++) {
            suggestions_list.add(new Suggestion(top_attractions[i], image[i]));
        }

        SuggestionAdapter itemsAdapter = new SuggestionAdapter(this, suggestions_list);

        ListView listView = (ListView) findViewById(R.id.list_view_main);
        listView.setAdapter(itemsAdapter);
    }

}
