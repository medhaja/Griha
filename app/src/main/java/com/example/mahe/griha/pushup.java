package com.example.mahe.griha;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;

import java.io.File;

public class pushup extends AppCompatActivity {

    int time=0,set=0;


    // MediaPlayer mp;

    NumberPicker noPicker1=null;
    NumberPicker noPicker2=null;
    String nums[]= {"0.5","0.75","1","1.25","1.5","1.75","2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);
        noPicker1=(NumberPicker)findViewById(R.id.pickNumber1);
        noPicker1.setMaxValue(5);
        noPicker1.setMinValue(1);

        noPicker1.setWrapSelectorWheel(false);


        noPicker2=(NumberPicker)findViewById(R.id.pickNumber2);
        noPicker2.setMaxValue(10);
        noPicker2.setMinValue(1);

        noPicker2.setWrapSelectorWheel(false);




        /*mp=MediaPlayer.create(getApplicationContext(),R.raw.s);// the song is a filename which i have pasted inside a folder **raw** created under the **res** folder.//
        mp.start();
        mp.setLooping(true);
*/



    }


    public void pushup2Activity(View view) {
        set=noPicker1.getValue();
        time=noPicker2.getValue();
        //  mp.stop();
        startActivity(new Intent(pushup.this, pushup2.class).putExtra("time", time));
    }


}

