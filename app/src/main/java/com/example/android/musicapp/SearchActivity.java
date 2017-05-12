package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        final EditText search_box = (EditText)findViewById(R.id.search_box);

        // Set a click listener for the browse View
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open Browse Activity
                Intent browseIntent = new Intent(SearchActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });

        // Set a click listener for the library View
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open LibraryActivity
                Intent libraryIntent = new Intent(SearchActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Set a click listener for the Now Playing View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open MainActivity
                Intent nowPlayingIntent = new Intent(SearchActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Set an action listener for the search field
        search_box.setOnEditorActionListener(new TextView.OnEditorActionListener(){
            @Override
            public boolean onEditorAction(TextView v, int actioNId, KeyEvent event) {
                // Type a toast notification informing user of what will be searched for.
                Toast.makeText(getApplicationContext(),"Search for " + search_box.getText().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}
