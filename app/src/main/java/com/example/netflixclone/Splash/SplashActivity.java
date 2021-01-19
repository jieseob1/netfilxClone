package com.example.netflixclone.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.example.netflixclone.Main.MainActivity;
import com.example.netflixclone.Profile.ProfileActivity;
import com.example.netflixclone.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        MediaPlayer ring= MediaPlayer.create(getApplicationContext(),R.raw.netflix_intro);
        ring.start();
    }

    private void postDelay(){
        new Handler().postDelayed(new Runnable() {// 4.5 초 후에 실행
            @Override
            public void run() {
                // 실행할 동작 코딩
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4500);
    }
}