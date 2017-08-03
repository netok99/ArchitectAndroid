package com.architectandroid.data.remote;

import com.architectandroid.data.model.Movie;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiService {

    @GET("movie/now_playing?")
    Observable<Movie> getMoviesPoster(@Query("api_key") String apiKey, @Query("page") int page);
}
