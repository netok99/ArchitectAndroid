package com.architectandroid.ui;

import com.architectandroid.data.dataSource.MoviesPosterDataSource;
import com.architectandroid.ui.MainActivity.MoviesPosterContract;
import com.architectandroid.ui.MainActivity.MoviesPosterPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    private BaseView view;

    public PresenterModule(BaseView view) {
        this.view = view;
    }

    @Provides
    MoviesPosterPresenter provideMoviesPosterPresenter(MoviesPosterDataSource dataSource) {
        if (view instanceof MoviesPosterContract.View) {
            return new MoviesPosterPresenter(view, dataSource);
        }
        throw new ClassCastException("view should be MoviesPosterContract.View");
    }
}
