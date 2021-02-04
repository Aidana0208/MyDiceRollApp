package com.example.mydcerollapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_1;
    ImageView imageView_2;

    private Random dice  = new Random();
    private int random_1;
    private int random_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_1 = findViewById(R.id.imageView1);
        imageView_2 = findViewById(R.id.imageView2);

        Button rollButton = findViewById(R.id.rollButton);
        rollButton.setOnClickListener(v -> {
            dice();
        });

        if (savedInstanceState != null) {
            random_1 = savedInstanceState.getInt("key_1");
            random_2 = savedInstanceState.getInt("key_2");
            getDiceImage(random_1);
            getDiceImage_2(random_2);
        }
    }

    public void dice() {
        random_1 = dice.nextInt(6) + 1;
        getDiceImage(random_1);
        random_2 = dice.nextInt(6) + 1;
        getDiceImage_2(random_2);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key_1", random_1);
        outState.putInt("key_2", random_2);
    }

    public void getDiceImage(int random) {
        switch (random) {
            case 1:
                imageView_1.setImageResource(R.drawable.image1);
                break;
            case 2:
                imageView_1.setImageResource(R.drawable.image2);
                break;
            case 3:
                imageView_1.setImageResource(R.drawable.image3);
                break;
            case 4:
                imageView_1.setImageResource(R.drawable.image4);
                break;
            case 5:
                imageView_1.setImageResource(R.drawable.image5);
                break;
            case 6:
                imageView_1.setImageResource(R.drawable.image6);
                break;
        }
    }

    public void getDiceImage_2(int random1) {
        switch (random1) {
            case 1:
                imageView_2.setImageResource(R.drawable.image1);
                break;
            case 2:
                imageView_2.setImageResource(R.drawable.image2);
                break;
            case 3:
                imageView_2.setImageResource(R.drawable.image3);
                break;
            case 4:
                imageView_2.setImageResource(R.drawable.image4);
                break;
            case 5:
                imageView_2.setImageResource(R.drawable.image4);
                break;
            case 6:
                imageView_2.setImageResource(R.drawable.image6);
                break;
        }
    }
}