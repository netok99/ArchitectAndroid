package com.architectandroid.ui.MainActivity;

import com.architectandroid.data.dataSource.MoviesPosterDataSource;
import com.architectandroid.ui.BaseView;

/**
 * Created by Neto on 03/08/17.
 */

public class MoviesPosterPresenter implements MoviesPosterContract.Presenter {

    private final BaseView view;
    private final MoviesPosterDataSource dataSource;

    public MoviesPosterPresenter(BaseView view, MoviesPosterDataSource dataSource) {
        this.view = view;
        this.dataSource = dataSource;
    }

    @Override
    public void getMoviesPoster(int page) {

    }
}
