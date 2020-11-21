package com.example.lab_android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaplayer = MediaPlayer.create(this, R.raw.piano);
        btn0 = (Button) findViewById(R.id.piano_btn);
        btn1 = (Button) findViewById(R.id.guitarra_btn);
        btn2 = (Button) findViewById(R.id.violin_btn);
        btn3 = (Button) findViewById(R.id.saxofon_btn);
        btn4 = (Button) findViewById(R.id.trompeta_btn);
        btn5 = (Button) findViewById(R.id.bajo_btn);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }

    private void reset_bnt(){
        btn0.setBackgroundColor(Color.BLUE);
        btn1.setBackgroundColor(Color.BLUE);
        btn2.setBackgroundColor(Color.BLUE);
        btn3.setBackgroundColor(Color.BLUE);
        btn4.setBackgroundColor(Color.BLUE);
        btn5.setBackgroundColor(Color.BLUE);
    }

    @Override
    public void onClick(View view) {
        mediaplayer.pause();
        reset_bnt();
        switch (view.getId()) {
            case R.id.piano_btn:
                mediaplayer = MediaPlayer.create(this, R.raw.piano);
                btn0.setBackgroundColor(Color.GREEN);
                break;
            case R.id.guitarra_btn:
                mediaplayer = MediaPlayer.create(this, R.raw.guitarra);
                btn1.setBackgroundColor(Color.GREEN);
                break;
            case R.id.violin_btn:
                mediaplayer = MediaPlayer.create(this, R.raw.violin);
                btn2.setBackgroundColor(Color.GREEN);
                break;
            case R.id.saxofon_btn:
                mediaplayer = MediaPlayer.create(this, R.raw.saxofon);
                btn3.setBackgroundColor(Color.GREEN);
                break;
            case R.id.trompeta_btn:
                mediaplayer = MediaPlayer.create(this, R.raw.trompeta);
                btn4.setBackgroundColor(Color.GREEN);
                break;
            case R.id.bajo_btn:
                mediaplayer = MediaPlayer.create(this, R.raw.bajo);
                btn5.setBackgroundColor(Color.GREEN);
                break;
        }
        mediaplayer.start();
    }





}