package com.architectandroid.data;

import com.architectandroid.BuildConfig;
import com.architectandroid.data.remote.ApiService;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class APIModule {

    @Provides
    @Singleton
    public ApiService provideAPIService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .baseUrl(BuildConfig.API_URL)
                .build();

        return retrofit.create(ApiService.class);
    }
}
