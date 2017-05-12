package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by es013620 on 2017-05-10.
 */

public class LibraryActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Find the Views that show the different pages
        TextView search = (TextView) findViewById(R.id.search_option);
        TextView browse = (TextView) findViewById(R.id.browse_option);
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        TextView playlists = (TextView) findViewById(R.id.playlists);
        TextView all_songs = (TextView) findViewById(R.id.all_songs);

        // Set a click listener for the search View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open SearchActivity
                Intent searchIntent = new Intent(LibraryActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Set a click listener for the browse View
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open BrowseActivity
                Intent browseIntent = new Intent(LibraryActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });
        // Set a click listener for the Now Playing View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open MainActivity
                Intent nowPlayingIntent = new Intent(LibraryActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Set a click listener for the playlists option
        playlists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Display playlists",Toast.LENGTH_SHORT).show();
            }
        });

        // Set a click listener for the all songs option
        all_songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Display all songs",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
