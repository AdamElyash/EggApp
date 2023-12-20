package com.example.eggapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity

        ;

public class MainActivity extends AppCompatActivity {
    private int counter;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 10;
        TextView counterTextView = findViewById(R.id.tesxtvie_counter);
        counterTextView.setText(""+counter);
    }

    @SuppressLint("SetTextI18n")
    public void knock(View view)
    {
        if (counter > 0)
        {
            counter--;
            TextView counterTextView = findViewById(R.id.tesxtvie_counter);
            counterTextView.setText(""+counter);
            if(counter == 0)
            {
                ImageView eggImageView = findViewById(R.id.imageview_egg);
                eggImageView.setImageResource(R.drawable.surprise_egg);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void reset(View view)
    {
        counter = 10;
        TextView counterTextView = findViewById(R.id.tesxtvie_counter);
        counterTextView.setText(""+counter);
        ImageView eggImageView = findViewById(R.id.imageview_egg);
        eggImageView.setImageResource(R.drawable.green_egg);
    }
}