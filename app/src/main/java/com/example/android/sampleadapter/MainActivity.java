package com.example.android.sampleadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] defaultWords = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] portugueseWords = new String[]{"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};


        ArrayList<User> arrayOfUsers = new ArrayList<User>();

        /**
         * Creating the Array Adapter and setting it into the ListView
         */
        ArrayAdapter<User> itemsAdapter = new CustomAdapter(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(itemsAdapter);

        for (int i = 0; i < defaultWords.length; i++) {
            User u = new User(defaultWords[i], portugueseWords[i], R.drawable.bucky);
            arrayOfUsers.add(u);
        }

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
