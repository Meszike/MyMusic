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

public class ClassicalActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        list = findViewById(R.id.list);
        list.setBackgroundResource(R.drawable.bg4);
        // Create  a list of words
        ArrayList<Music> musics = new ArrayList<Music>();

        musics.add(new Music("Gioachino Rossini ", "Overture to William Tell"));
        musics.add(new Music("Christian Petzold ", "Minuet in G Major"));
        musics.add(new Music("Richard Strauss ", "Dawn from Thus Spake Zarathustra"));
        musics.add(new Music("Ludwig van Beethoven ", "Ode to Joy"));
        musics.add(new Music("Wolfgang A. Mozart ", "Eine Kleine Nachtmusik "));
        musics.add(new Music("Johann S. Bach ", "Toccata in d minor"));
        musics.add(new Music("Richard Wagner ", "Ride of the Valkyries"));
        musics.add(new Music("George F. Handel ", "kHallelujah Chorus"));
        musics.add(new Music("Richard Wagner ", "Here Comes the Bride"));
        musics.add(new Music("Ludwig van Beethoven ", "Symphony #5"));

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
                Intent playerIntent = new Intent(ClassicalActivity.this, PlayerActivity.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });


    }


}

