package com.example.listviewpractice_whatsappclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<User> userArrayList;

    private MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);
        userArrayList = new ArrayList<>();

        User user1 = new User(R.drawable.blackpanther, "Black Panther", "Wakanda Forever!");
        User user2 = new User(R.drawable.ironman, "Iron Man", "I love you 3000!");
        User user3 = new User(R.drawable.captainamerica, "Captain America", "Avengers Assemble!");
        User user4 = new User(R.drawable.rocket, "Rocket", "Don't call me a Racoon!!");
        User user5 = new User(R.drawable.loki, "Loki", "I am Loki of Asguard!");
        User user6 = new User(R.drawable.groot, "Groot", "I am Groot!");
        User user7 = new User(R.drawable.hulk, "Hulk", "Hulk Smash!!!!");
        User user8 = new User(R.drawable.antman, "Antman", "I have holes!!");
        User user9 = new User(R.drawable.starlord, "Star Lord",  "Dance Off, Bro!");
        User user10 = new User(R.drawable.thor, "Thor-God of Thunder",  "You have my word!");





        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        userArrayList.add(user6);
        userArrayList.add(user7);
        userArrayList.add(user8);
        userArrayList.add(user9);
        userArrayList.add(user10);


        adapter = new MyCustomAdapter(getApplicationContext(), userArrayList);
        listView.setAdapter(adapter);










    }
}