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

        String[] defaultWords = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] portugueseWords = new String[]{"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};


        /**
         * Creating the Array Adapter and setting it into the ListView
         */
        ArrayAdapter<String> itemsAdapter = new CustomAdapter(this, defaultWords);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(itemsAdapter);

        /**
         * Setting Click Listener to items on ListView
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /**
                 * Getting each individual item from ListView
                 */
                String word = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, word, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
