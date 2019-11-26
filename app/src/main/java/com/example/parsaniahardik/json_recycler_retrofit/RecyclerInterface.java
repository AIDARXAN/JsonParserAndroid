package com.example.parsaniahardik.json_recycler_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {

    String JSONURL = "http://www.stat.kg/en/opendata/category/31/";

    @GET("json")
    Call<String> getString();
}
