package com.example.abhik.ssoapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Tax_display extends AppCompatActivity {

    RecyclerView rv_tax;
    FloatingActionButton fab;
    DisplayAdapter displayadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_display);
        rv_tax = (RecyclerView) findViewById(R.id.rvViewDtl);
        rv_tax.setLayoutManager(new LinearLayoutManager(this));
        displayadapter = new DisplayAdapter((this));
        rv_tax.setAdapter(displayadapter);
    }
}
