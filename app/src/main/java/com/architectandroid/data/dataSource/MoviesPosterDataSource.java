package com.architectandroid.data.dataSource;

import com.architectandroid.data.model.Movie;

import rx.Observable;

public interface MoviesPosterDataSource {
    Observable<Movie> getMoviesPoster(String apiKey, int page);
}
