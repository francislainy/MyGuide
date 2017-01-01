package com.example.android.myguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout top_attractions_linear_layout = (LinearLayout) findViewById(R.id.top_attractions_linear_layout);
        top_attractions_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TopAttractions.class);
                startActivity(intent);
            }
        });

        LinearLayout free_things_linear_layout = (LinearLayout) findViewById(R.id.free_things__linear_layout);
        free_things_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FreeThings.class);
                startActivity(intent);
            }
        });

        LinearLayout places_to_eat_linear_layout = (LinearLayout) findViewById(R.id.places_to_eat_linear_layout);
        places_to_eat_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlacesToEat.class);
                startActivity(intent);
            }
        });

        LinearLayout to_do_outside_linear_layout = (LinearLayout) findViewById(R.id.to_do_outside_linear_layout);
        to_do_outside_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToDoOutside.class);
                startActivity(intent);
            }
        });



    }
}
