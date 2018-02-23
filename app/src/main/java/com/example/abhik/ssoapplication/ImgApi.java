package com.example.abhik.ssoapplication;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by abhik on 11/02/18.
 */

public interface ImgApi {
    @GET("/hackdata")
    Call<ArrayList<Img>> getImages();
}
