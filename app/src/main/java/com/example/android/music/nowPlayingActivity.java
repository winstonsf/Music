package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class nowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
    }

    public void switchAlbum(View view) {
        // Create a new intent to open the {@link albumsActivity}
        Intent albumsIntent = new Intent(nowPlayingActivity.this, albumsActivity.class);

        // Start the new activity
        startActivity(albumsIntent);
    }

    public void switchArtist(View view) {
        // Create a new intent to open the {@link albumsActivity}
        Intent artistIntent = new Intent(nowPlayingActivity.this, artistActivity.class);

        // Start the new activity
        startActivity(artistIntent);
    }
}



