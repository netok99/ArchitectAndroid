package com.architectandroid.ui.MainActivity;

import android.os.Bundle;

import com.architectandroid.R;
import com.architectandroid.ui.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MoviesPosterContract.View {

    @Inject
    private MoviesPosterContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        UiComponent uiComponent = creatorUiComponent(this);
//        uiComponent.inject(this);
    }
}
