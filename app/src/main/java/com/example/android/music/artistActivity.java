package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class artistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
    }

    public void switchAlbum(View view) {
        // Create a new intent to open the {@link albumsActivity}
        Intent albumsIntent = new Intent(artistActivity.this, albumsActivity.class);

        // Start the new activity
        startActivity(albumsIntent);
    }

    public void switchNowPlaying(View view) {
        // Create a new intent to open the {@link albumsActivity}
        Intent nowPlayingIntent = new Intent(artistActivity.this, nowPlayingActivity.class);

        // Start the new activity
        startActivity(nowPlayingIntent);
    }
}