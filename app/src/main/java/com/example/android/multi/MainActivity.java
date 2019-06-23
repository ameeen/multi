package com.example.android.multi;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


//        // Find the View that shows the numbers category
//        TextView textViewNumbers = (TextView) findViewById(R.id.numbers);
//        // Set a click listener on that View
//        textViewNumbers.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View v) {
//                Log.v("mainactivity", "gd");
//                Intent numberList = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numberList);
//            }
//        });
//        // Find the View that shows the colors category
//        TextView textViewColors = (TextView) findViewById(R.id.colors);
//        // Set a click listener on that View
//        textViewColors.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors View is clicked on.
//            @Override
//            public void onClick(View v) {
//                Log.v("mainactivity", "gd");
//                Intent colorList = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colorList);
//            }
//        });
//
//        // Find the View that shows the phrases category
//        TextView textViewPhrases = (TextView) findViewById(R.id.phrases);
//        // Set a click listener on that View
//        textViewPhrases.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the phrases View is clicked on.
//            @Override
//            public void onClick(View v) {
//                Log.v("mainactivity", "gd");
//                Intent phrasesList = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phrasesList);
//            }
//        });
//
//        // Find the View that shows the Family category
//        TextView textViewFamily = (TextView) findViewById(R.id.family);
//        // Set a click listener on that View
//        textViewFamily.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the Family View is clicked on.
//            @Override
//            public void onClick(View v) {
//                Log.v("mainactivity", "gd");
//                Intent familyList = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(familyList);
//            }
//        });
    }
}
