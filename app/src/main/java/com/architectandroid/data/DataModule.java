package com.architectandroid.data;

import com.architectandroid.App;
import com.architectandroid.data.Repository.MoviesPosterRepository;
import com.architectandroid.data.dataSource.MoviesPosterDataSource;
import com.architectandroid.data.remote.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    @Singleton
    public MoviesPosterDataSource provideMoviesPosterRepository(ApiService api, App app) {
        return new MoviesPosterRepository(api, app);
    }
}
