package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by es013620 on 2017-05-10.
 */

public class SearchActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        // Find the Views that show the different pages
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        TextView browse = (TextView) findViewById(R.id.browse_option);
        TextView library = (TextView) findViewById(R.id.library_option);


        // Set a click listener for the browse View
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent browseIntent = new Intent(SearchActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });

        // Set a click listener for the library View
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent libraryIntent = new Intent(SearchActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Set a click listener for the Now Playing View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent nowPlayingIntent = new Intent(SearchActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
