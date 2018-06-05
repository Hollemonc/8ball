package com.example.chrom.a8ballfromhell;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAlert(View view) {
        int min = 1;
        int max = 6;

        Random r = new Random();

        int clickCount = r.nextInt(max - min + 1) + min;
        TextView counter = (TextView) findViewById(R.id.clickCount);
        if (clickCount == 1){
            counter.setText("Ya... dream on man! Maybe you should avoid the drugs!");
        }
        if (clickCount == 2){
            counter.setText("The only answers your going to get from me... nevermind!");
        }
        if (clickCount == 3){
            counter.setText("you ever hear the one about jumping off a bridge!");
        }
        if (clickCount == 4){
            counter.setText("hahahahah..... cough your still here?");
        }
        if (clickCount == 5){
            counter.setText("Don't quit your day job and maybe one day... I take that back");
        }
        if (clickCount == 6){
            counter.setText("Nope");
        }


        //counter.setText(String.valueOf(clickCount));
    }
}

