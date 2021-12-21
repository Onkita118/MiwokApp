package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);

         // Set a click listener on that View
        numbers.setOnClickListener(new OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this,NumberActivity.class);
                startActivity(numbersIntent);
            }
        });


        TextView member = (TextView) findViewById(R.id.member);

        // Set a click listener on that View
        member.setOnClickListener(new OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view){
                Intent memberIntent = new Intent(MainActivity.this,MembersActivity.class);
                startActivity(memberIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);

         // Set a click listener on that View
        phrases.setOnClickListener(new OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view){
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        TextView color = (TextView) findViewById(R.id.color);

        // Set a click listener on that View
        color.setOnClickListener(new OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view){
                Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });


    }

}