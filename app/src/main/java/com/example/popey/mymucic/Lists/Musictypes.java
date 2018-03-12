package com.example.popey.mymucic.Lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.popey.mymucic.Activities.ClassicalActivity;
import com.example.popey.mymucic.Activities.JazzActivity;
import com.example.popey.mymucic.Activities.PopActivity;
import com.example.popey.mymucic.Activities.RockActivity;
import com.example.popey.mymucic.R;

/**
 * Created by POPEY on 2018. 03. 06..
 */

public class Musictypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the types-activity.xml layout file
        setContentView(R.layout.types_activity);


        // Find the View that shows the pop category
        ImageView pop = (ImageView) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent popIntent = new Intent(Musictypes.this, PopActivity.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the rock category
       ImageView rock = (ImageView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent rockIntent = new Intent(Musictypes.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the jazz category
        ImageView jazz = (ImageView) findViewById(R.id.jazz);

        // Set a click listener on that View
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link JazzActivity}
                Intent jazzIntent = new Intent(Musictypes.this, JazzActivity.class);

                // Start the new activity
                startActivity(jazzIntent);
            }
        });

        // Find the View that shows the classical category
        ImageView classical = (ImageView) findViewById(R.id.classical);

        // Set a click listener on that View
       classical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent classicalIntent = new Intent(Musictypes.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(classicalIntent);
            }
        });
    }
}



