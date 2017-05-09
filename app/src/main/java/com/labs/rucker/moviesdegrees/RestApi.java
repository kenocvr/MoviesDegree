package com.labs.rucker.moviesdegrees;

import com.labs.rucker.moviesdegrees.Pojos.Pojo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Carlos on 5/8/2017.
 */

public interface RestApi {


    @GET("/info.0.json")
    Call<Pojo> getJsonCurrent();

    @GET("/{num}/info.0.json")
    Call<Pojo> getJson(@Path(value = "num", encoded = true) String comic);


}
