package com.example.demo_application;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    private TextView text2, text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_4);

         ActionBar actionBar= getSupportActionBar();
         actionBar.setTitle("Activity4");

         text1=(TextView) findViewById(R.id.id5);
       text2=(TextView) findViewById(R.id.id4);

       Intent intent6= getIntent();
       String username= intent6.getStringExtra( "keyname");
       String usermail= getIntent().getStringExtra("keymail");

       text2.setText("Welcome " + username);
       text1.setText("Yor email id is " + usermail);

    }
}