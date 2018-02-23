package com.example.abhik.ssoapplication;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GraphActivity extends AppCompatActivity {

    ImageView img1, img2;
    Context context;
    FloatingActionButton fab;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        img1 = (ImageView) findViewById(R.id.imgview);
        img2 = (ImageView) findViewById(R.id.imgview2);

        img1.setImageResource(R.drawable.edu);
        img2.setImageResource(R.drawable.schoolgoingchildren);

        btn = (Button) findViewById(R.id.btn_contact);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(GraphActivity.this, NewActivity.class);
                startActivity(i);
            }
        });

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GraphActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
