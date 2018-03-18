package com.example.mahe.griha;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plankActivity(View view) {
        startActivity(new Intent(MainActivity.this, Plank.class));
    }
    public void pushupActivity(View view) {
        startActivity(new Intent(MainActivity.this, pushup.class));
    }
    public void pullupActivity(View view) {
        startActivity(new Intent(MainActivity.this, pullup.class));
    }


}
