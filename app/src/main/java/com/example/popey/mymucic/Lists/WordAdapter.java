package com.example.popey.mymucic.Lists;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.popey.mymucic.Lists.Music;
import com.example.popey.mymucic.R;

import java.util.ArrayList;

/**
 * Created by POPEY on 2018. 03. 06..
 */

public class WordAdapter extends ArrayAdapter<Music> {


    public WordAdapter(Activity context, ArrayList<Music> music) {
        // Initialize the WordAdapter's internal storage
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Music} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the title from the current currentMusic object and
        // set this text on the name TextView
        titleTextView.setText(currentMusic.gettitle());

        // Find the TextView in the list_item.xml layout with the ID player
        TextView playerTextView = (TextView) listItemView.findViewById(R.id.player);
        // Get the player from the currentMusic object and
        // set this text on the default TextView
        playerTextView.setText(currentMusic.getplayer());


        // Return the whole list item layout
        return listItemView;


    }
}

