package com.example.pendeteksi_jarak.configs;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IAPIDistance {
    @GET("maps/api/distancematrix/json")
    Single<ResultDistance> getDistance(@Query("key") String key,
                                       @Query("origins") String origin,
                                       @Query("destinations") String destinations);

}
