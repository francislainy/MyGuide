package com.example.android.myguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoOutside extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_main_layout);

        String[] outside = new String[]{"London Beach", "London Park", "Biking", "Outdoor Concert", "Skating"};
        int[] image = new int[]{R.drawable.category_to_do_outside_beach, R.drawable.category_to_do_outside_park,
                R.drawable.category_to_do_outside_biking, R.drawable.category_to_do_outside_concert, R.drawable.category_to_do_outside_skating};

        ArrayList<Suggestion> suggestions_list = new ArrayList<Suggestion>();

        for(int i=0; i<outside.length; i++) {
            suggestions_list.add(new Suggestion(outside[i], image[i]));
        }

        SuggestionAdapter itemsAdapter = new SuggestionAdapter(this, suggestions_list);

        ListView listView = (ListView) findViewById(R.id.list_view_main);
        listView.setAdapter(itemsAdapter);
    }

}
