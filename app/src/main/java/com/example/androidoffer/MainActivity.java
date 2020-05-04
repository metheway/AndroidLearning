package com.example.androidoffer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Debug.startMethodTracing("tmps");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        Debug.stopMethodTracing();
        super.onDestroy();
    }
}
