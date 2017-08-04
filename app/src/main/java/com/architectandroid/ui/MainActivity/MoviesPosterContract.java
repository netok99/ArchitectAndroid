package com.architectandroid.ui.MainActivity;

import com.architectandroid.ui.BaseView;

public class MoviesPosterContract {
    public interface View extends BaseView {
    }

    public interface Presenter {
        void getMoviesPoster(int page);
    }
}
