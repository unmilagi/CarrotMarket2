package com.example.goo.carrotmarket.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Goo on 2019-04-14.
 */

public class ApiClient {

    public static final String BASE_URL = "http://54.180.32.57/CarrotMarket/";
    public static Retrofit retrofit;

    public static Retrofit getApiLocation(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}