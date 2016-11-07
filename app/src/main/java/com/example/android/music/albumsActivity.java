package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class albumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
    }

    public void switchNowPlaying(View view) {
        // Create a new intent to open the {@link albumsActivity}
        Intent nowPlayingIntent = new Intent(albumsActivity.this, nowPlayingActivity.class);

        // Start the new activity
        startActivity(nowPlayingIntent);
    }

    public void switchArtist(View view) {
        // Create a new intent to open the {@link albumsActivity}
        Intent artistIntent = new Intent(albumsActivity.this, artistActivity.class);

        // Start the new activity
        startActivity(artistIntent);
    }
}



