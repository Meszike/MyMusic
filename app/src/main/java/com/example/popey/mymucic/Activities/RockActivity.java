package com.example.popey.mymucic.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.popey.mymucic.Lists.Music;
import com.example.popey.mymucic.R;
import com.example.popey.mymucic.Lists.WordAdapter;

import java.util.ArrayList;

/**
 * Created by POPEY on 2018. 03. 06..
 */

public class RockActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        list = findViewById(R.id.list);
        list.setBackgroundResource(R.drawable.bg2);

        // Create  a list of words
        ArrayList<Music> musics = new ArrayList<Music>();

        musics.add(new Music("Led Zeppelin", "Stairway To Heaven"));
        musics.add(new Music("Queen", "Bohemian Rhapsody"));
        musics.add(new Music("Lynyrd Skynyrd ", "Free Bird"));
        musics.add(new Music("Deep Purple ", "Smoke On The Water"));
        musics.add(new Music("Pink Floyd ", "Comfortably Numb"));
        musics.add(new Music("Led Zeppelin ", "Kashmir"));
        musics.add(new Music("Rainbow", "Stargazer"));
        musics.add(new Music("Guns N' Roses ", "Sweet Child O' Mine"));
        musics.add(new Music("Ac/Dc", "Back In Black"));
        musics.add(new Music("Black Sabbath ", "Paranoid"));

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
                Intent playerIntent = new Intent(RockActivity.this, PlayerActivity.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });

    }

}
