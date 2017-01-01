package com.example.android.myguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Francislainy on 01/01/2017.
 */

public class SuggestionAdapter extends ArrayAdapter<Suggestion> {

    public SuggestionAdapter(Context context, ArrayList<Suggestion> suggestions) {
        super(context, 0, suggestions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Suggestion suggestion = getItem(position);

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_list_view_item, parent, false);

        TextView textView = (TextView) convertView.findViewById(R.id.text_view_model_layout);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_model_layout);

        textView.setText(suggestion.getDescription());
        imageView.setImageResource(suggestion.getImage());

        return convertView;
    }
}
