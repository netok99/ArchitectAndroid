package com.architectandroid.ui;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;

import com.architectandroid.App;
import com.architectandroid.AppComponent;

public class BaseActivity extends AppCompatActivity {

    AppComponent getAppComponent() {
        return App.getAppComponent();
    }

    boolean isOnline(Context context) {
        ConnectivityManager connectionManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connectionManager.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnected();
    }
}
