package com.example.abhik.ssoapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class All_tax extends AppCompatActivity {

    RecyclerView rvTaxList;
    FloatingActionButton fab;
    TaxAdapter taxAdapter;
    private DatabaseReference databaseReference;
    public static final String TAG = "alltax";

    ArrayList<Tax> taxArrayList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tax);
        Log.d(TAG, "onCreate: 11");
        rvTaxList = (RecyclerView) findViewById(R.id.rvTaxList);
        rvTaxList.setLayoutManager(new LinearLayoutManager(this));
        taxAdapter = new TaxAdapter(taxArrayList,this);
        Log.d(TAG, "onCreate: 12");
        rvTaxList.setAdapter(taxAdapter);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(All_tax.this, MainActivity.class);
                startActivity(i);
            }
        });
        Log.d(TAG, "onCreate: 13");
        addStudent();

    }

    public void addStudent(){
        taxArrayList = getNewTax();
        taxAdapter.notifyDataSetChanged();
    }

    static ArrayList<Tax> generateTaxes(){
        ArrayList<Tax> newTaxes = new ArrayList<>();
        newTaxes.add(new Tax("15167892","2015-16","10,000"));
        return newTaxes;
    }
    static  ArrayList<Tax> getNewTax(){
        Log.d(TAG, "getNewTax: 13");
        ArrayList<Tax> newTaxes = new ArrayList<>();
        newTaxes.add(new Tax("12137892","2012-13","10,000"));
        newTaxes.add(new Tax("13147892","2013-14","20,000"));
        newTaxes.add(new Tax("14157892","2014-15","22,000"));
        newTaxes.add(new Tax("15167892","2015-16","24,000"));
        newTaxes.add(new Tax("16177892","2016-17","25,000"));
        return newTaxes;
    }

}
