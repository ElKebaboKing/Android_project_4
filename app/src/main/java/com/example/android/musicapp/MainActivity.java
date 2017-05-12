package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Views that show the different pages
        TextView search = (TextView) findViewById(R.id.search_option);
        TextView browse = (TextView) findViewById(R.id.browse_option);
        TextView library = (TextView) findViewById(R.id.library_option);
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        // Set a click listener for the search View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Set a click listener for the browse View
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });

        // Set a click listener for the library View
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });
    }
}
