package com.example.mahe.griha;

import android.app.ActionBar;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pushup2 extends AppCompatActivity {



    TextView tv;
    MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup2);

        tv = (TextView)findViewById(R.id.textView4);

        int time = getIntent().getIntExtra("time",1);
        Log.i("time",time+"");
        mp1=MediaPlayer.create(getApplicationContext(),R.raw.onetofifty);// the song is a filename which i have pasted inside a folder **raw** created under the **res** folder.//
        for( int countset=0;countset<time;countset++) {
            mp1.start();

            mp1.setLooping(false);
        }
        showTime(time);

    }

    public void showTime(int time){
        tv.setText(time+"");
    }

    public void onPuase(View view){
        mp1.pause();
    }
    public void onStop(View view){
        mp1.stop();
    }
    public void onResume(View view){
        mp1.start();
    }
    public void onreset(View view){
        mp1.seekTo(1);
    }



    // for(int i=0;i<set)
}
