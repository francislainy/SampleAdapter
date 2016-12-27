package com.example.android.sampleadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] defaultWords = new String[]{"one", "two", "three", "four", "five"};
        String[] portugueseWords = new String[]{"um", "dois", "tres", "quatro", "cinco"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, defaultWords);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String word = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, word, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
