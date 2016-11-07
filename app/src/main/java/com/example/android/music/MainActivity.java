package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Now Playing category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link nowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, nowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link albumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, albumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });


    }
}