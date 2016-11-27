package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Button button = (Button) findViewById(R.id.buttonNowPlaying);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        Button button2 = (Button) findViewById(R.id.buttonArtist);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent artistIntent = new Intent(AlbumsActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });
    }
}



