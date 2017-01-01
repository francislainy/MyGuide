package com.example.android.myguide;

/**
 * Created by Francislainy on 01/01/2017.
 */

public class Suggestion {

    private String description;
    private int image;

    public Suggestion(String description, int image) {
        this.description = description;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

}
