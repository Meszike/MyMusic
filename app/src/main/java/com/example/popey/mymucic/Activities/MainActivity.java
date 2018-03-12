package com.example.popey.mymucic.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.popey.mymucic.Lists.Musictypes;
import com.example.popey.mymucic.R;

public class MainActivity extends AppCompatActivity {
    Button startButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * StartButton click.
         */
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(MainActivity.this, Musictypes.class);
                startActivity(start);
            }
        });


    }
}