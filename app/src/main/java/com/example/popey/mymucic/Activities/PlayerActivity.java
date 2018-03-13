package com.example.popey.mymucic.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import com.example.popey.mymucic.R;

/**
 * Created by POPEY on 2018. 03. 11..
 */

public class PlayerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);


       // Find the View that shows the play button
        ImageButton back = (ImageButton) findViewById(R.id.imageButton6);


        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {

                Intent backIntent = new Intent(PlayerActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });


    }
}