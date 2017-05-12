package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by es013620 on 2017-05-10.
 */

public class QueueActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        // Find the Views that show the different pages
        TextView search = (TextView) findViewById(R.id.search_option);
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        TextView library = (TextView) findViewById(R.id.library_option);

        // Set a click listener for the search View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent searchIntent = new Intent(QueueActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Set a click listener for the library View
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open LibraryActivity
                Intent libraryIntent = new Intent(QueueActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Set a click listener for the Now Playing View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open MainActivity
                Intent nowPlayingIntent = new Intent(QueueActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
