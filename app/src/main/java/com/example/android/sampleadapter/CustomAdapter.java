package com.example.android.sampleadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Francislainy on 27/12/2016.
 */

public class CustomAdapter extends ArrayAdapter<User> {

    CustomAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        User user = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_custom_layout, parent, false);
        }

//        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
//        View customView = layoutInflater.inflate(R.layout.list_custom_layout, parent, false);

        TextView title_textView = (TextView) convertView.findViewById(R.id.title_text_view);
        TextView subtitle_textView = (TextView) convertView.findViewById(R.id.subtitle_text_view);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        title_textView.setText(user.getTitle());
        subtitle_textView.setText(user.getSubtitle());
        image.setImageResource(R.drawable.bucky);

        return convertView;
    }

}