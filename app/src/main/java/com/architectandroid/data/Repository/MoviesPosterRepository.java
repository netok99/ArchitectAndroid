package com.architectandroid.data.Repository;

import com.architectandroid.App;
import com.architectandroid.data.dataSource.MoviesPosterDataSource;
import com.architectandroid.data.model.Movie;
import com.architectandroid.data.remote.ApiService;

import rx.Observable;

public class MoviesPosterRepository implements MoviesPosterDataSource {

    private final ApiService api;
    private final App app;

    public MoviesPosterRepository(ApiService api, App app) {
        this.app = app;
        this.api = api;
    }

    @Override
    public Observable<Movie> getMoviesPoster(String apiKey, int page) {
        return api.getMoviesPoster(apiKey, page);
    }
}
