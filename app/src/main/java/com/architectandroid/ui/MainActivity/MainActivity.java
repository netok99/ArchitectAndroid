package com.architectandroid.ui.MainActivity;

import android.os.Bundle;

import com.architectandroid.App;
import com.architectandroid.R;
import com.architectandroid.ui.BaseActivity;
import com.architectandroid.ui.PresenterModule;
import com.architectandroid.ui.UiComponent;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MoviesPosterContract.View {

    @Inject
    private MoviesPosterContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UiComponent uiComponent = getAppComponent().creatorUiComponent(new PresenterModule(this));
        uiComponent.inject(this);
        presenter.getMoviesPoster(1);
    }

    @Override
    public void showLoadingIndicator(Boolean isLoading) {

    }
}
