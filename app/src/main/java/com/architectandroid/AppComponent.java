package com.architectandroid;

import com.architectandroid.data.APIModule;
import com.architectandroid.data.DataModule;
import com.architectandroid.ui.PresenterModule;
import com.architectandroid.ui.UiComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, APIModule.class})
public interface AppComponent {
    void inject(App app);
    UiComponent creatorUiComponent(PresenterModule presenterModule);
}
