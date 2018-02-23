package com.example.abhik.ssoapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class sample extends AppCompatActivity {


    FloatingActionButton fab;
    CardView crd;
    TextView tv1;
    public static final String TAG = "lol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sample.this, MainActivity.class);
                startActivity(i);
            }
        });

        crd = (CardView) findViewById(R.id.clickcard);
        crd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sample.this,breakdown.class);
                startActivity(i);
            }
        });

        tv1 = (TextView) findViewById(R.id.tv_usrID);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user!=null) {
            String email = user.getEmail();
            tv1.setText("Welcome " + email);
            Log.d(TAG, "onCreate: " + user.getDisplayName());

        }
    }
}
