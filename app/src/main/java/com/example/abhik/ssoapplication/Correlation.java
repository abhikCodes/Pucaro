package com.example.abhik.ssoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Correlation extends AppCompatActivity {


    ImageView img_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correlation);

        img_view = (ImageView) findViewById(R.id.img_graph);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.checkpoint61.hasura-app.io")
                .addConverterFactory(
                        GsonConverterFactory.create()
                )
                .build();
        ImgApi imgApi = retrofit.create(ImgApi.class);
        Callback<ArrayList<Img>> imgCallback = new Callback<ArrayList<Img>>() {
            @Override
            public void onResponse(Call<ArrayList<Img>> call, Response<ArrayList<Img>> response) {

            }

            @Override
            public void onFailure(Call<ArrayList<Img>> call, Throwable t) {

            }
        };
        imgApi.getImages().enqueue(imgCallback);
    }
}
