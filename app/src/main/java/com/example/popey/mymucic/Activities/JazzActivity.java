package com.example.popey.mymucic.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.popey.mymucic.Lists.Music;
import com.example.popey.mymucic.R;
import com.example.popey.mymucic.Lists.WordAdapter;

import java.util.ArrayList;

/**
 * Created by POPEY on 2018. 03. 06..
 */

public class JazzActivity extends AppCompatActivity {

    ListView list;
    ImageView playerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        list = findViewById(R.id.list);
        list.setBackgroundResource(R.drawable.bg3);

        // Create  a list of words
        ArrayList<Music> musics = new ArrayList<Music>();

        musics.add(new Music("Dave Brubeck ", "Take Five"));
        musics.add(new Music("Louis Armstrong ", "What a Wonderful World"));
        musics.add(new Music("John Coltrane Quartet ", "Acknowledgment"));
        musics.add(new Music("Dave Brubeck", "My Favorite Things"));
        musics.add(new Music("Kenny Burrell ", "All Blues"));
        musics.add(new Music("Maynard Ferguson ", "Birdland"));
        musics.add(new Music("Nina Simone ", "Strange Fruit"));
        musics.add(new Music("Benny Goodman and His Orchestra ", "Sing, Sing, Sing"));
        musics.add(new Music("Hermao Feriera ", "Song for My Father"));
        musics.add(new Music("Miles Davis", "So What"));

        // Create a WordAdapter

        WordAdapter adapter =
                new WordAdapter(this, musics);

        // Set the listView
        ListView listView = (ListView) findViewById(R.id.list);


        //  Set the adapter
        listView.setAdapter(adapter);

        //Set the list item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent playerIntent = new Intent(JazzActivity.this, Player_activity.class);

                // Start the new activity
                startActivity(playerIntent);


            }
        });

    }

}

