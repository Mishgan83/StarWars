package com.example.starwars.rest;

import com.example.starwars.model.rest.RawResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApiPeoples {

    @GET("/api/people/?format=json")
    Observable<RawResult> getAllPeoples(
            @Query("page") Integer page
    );

}
