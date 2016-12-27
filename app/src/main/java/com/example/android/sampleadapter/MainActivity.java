package com.example.android.sampleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] defaultWords = new String[]{"one", "two", "three", "four", "five"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, defaultWords);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(itemsAdapter);
    }
}
