package com.example.android.sampleadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Francislainy on 27/12/2016.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.list_custom_layout, foods);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.list_custom_layout, parent, false);

        String singleWord = getItem(position);
        TextView title_textView = (TextView) customView.findViewById(R.id.title_text_view);
        ImageView image = (ImageView) customView.findViewById(R.id.image);

        title_textView.setText(singleWord);
        image.setImageResource(R.drawable.bucky);

        return customView;
    }

}