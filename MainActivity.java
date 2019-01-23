package com.example.krobinson20.myapplication;

import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // list of variables used
    //set of 5 image views used for setting the dice to new images
    //array of image views that holds all the dice
    private ImageView die1;
    private  ImageView die2;
    private  ImageView die3;
    private  ImageView die4;
    private  ImageView die5;
    private ImageView[] dc =new ImageView[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when the roll dice button is clicked it will put all the image views into the array and then
            //call the roll dice function
            public void onClick(View v) {
                die1 = findViewById(R.id.imageView4);
                die2 = findViewById(R.id.imageView5);
                die3 = findViewById(R.id.imageView);
                die4 = findViewById(R.id.imageView2);
                die5 = findViewById(R.id.imageView3);
                dc[0] = die1;
                dc[1] = die2;
                dc[2] = die3;
                dc[3] = die4;
                dc[4] = die5;

             rolldice();

                }

        });
    }

    //this function will execute 20 times
    //for each image view it will generate a random number and set the image to that side of the dice
    //it will then pause the for loop after the new image is set
    private void rolldice() {
                for(int f=0;f<20;f++){
                    for (int i = 0; i < dc.length; i++) {
                        Random r = new Random();
                        int rand = r.nextInt(6 - 1) + 1;
                        if (rand == 1) {
                            dc[i].setImageResource(R.drawable.side1);
                        } else if (rand == 2) {
                            dc[i].setImageResource(R.drawable.side2);
                        } else if (rand == 3) {
                            dc[i].setImageResource(R.drawable.side3);
                        } else if (rand == 4) {
                            dc[i].setImageResource(R.drawable.side4);
                        } else if (rand == 5) {
                            dc[i].setImageResource(R.drawable.side5);
                        } else if (rand == 6) {
                            dc[i].setImageResource(R.drawable.side6);
                        }
                        try{
                            Thread.sleep(10);
                        }
                        catch(InterruptedException ex){}
                    }

                }
    }
        }




