package com.example.demo_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    private Button button2;
    public EditText name, email;
    public String username, usermail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_2);

        EditText name = findViewById(R.id.id1);
        EditText email = findViewById(R.id.id2);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String usermail = email.getText().toString();

                Intent intent3 = new Intent(Activity2.this, Activity4.class);
                intent3.putExtra("keyname", username);
                intent3.putExtra("keymail", usermail);
                startActivity(intent3);


            }
        });

    }
}
