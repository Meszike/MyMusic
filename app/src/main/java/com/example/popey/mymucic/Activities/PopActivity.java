package com.example.popey.mymucic.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.popey.mymucic.Lists.Music;
import com.example.popey.mymucic.Lists.Musictypes;
import com.example.popey.mymucic.R;
import com.example.popey.mymucic.Lists.WordAdapter;

import java.util.ArrayList;

/**
 * Created by POPEY on 2018. 03. 06..
 */

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create  a list of words
        ArrayList<Music> musics = new ArrayList<Music>();

        musics.add(new Music("Michael Jackson", "Thriller"));
        musics.add(new Music("Madonna", "Like A Prayer"));
        musics.add(new Music("Prince", "When Doves Cry"));
        musics.add(new Music("Whitney Houston", "I Wanna Dance with Somebody (Who Loves me)"));
        musics.add(new Music("Britney Spears", "Baby One More Time"));
        musics.add(new Music("NSYNC", "It's Gonna Be Me"));
        musics.add(new Music("Backstreet Boys", "Everybody"));
        musics.add(new Music("Adele", "Rolling in the Deep"));
        musics.add(new Music("Beyonce", "Single Ladies"));
        musics.add(new Music("Christina Aguilera", "Genie in a Bottle"));

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
             Intent playerIntent = new Intent(PopActivity.this, Player_activity.class);

             // Start the new activity
             startActivity(playerIntent);
         }
     });

    }




}
