package com.example.goslinglovelaceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         int orientation;
        orientation=getResources().getConfiguration().orientation;
        if(orientation==1) {
            setContentView(R.layout.activity_main);
        }
        else{
            setContentView(R.layout.landscape);

        }
    }
}
