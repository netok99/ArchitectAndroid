package com.architectandroid.ui;

import javax.inject.Singleton;

import com.architectandroid.ui.MainActivity.MainActivity;

import dagger.Subcomponent;

@Singleton
@Subcomponent(modules = {PresenterModule.class})
public interface UiComponent {
    void inject(MainActivity activity);
}

