package com.vkramarenko.procachaniytest.providers;

import android.os.AsyncTask;

import com.vkramarenko.procachaniytest.GetUrlOfImageFromGoogle;
import com.vkramarenko.procachaniytest.models.Model;
import com.vkramarenko.procachaniytest.settings.Preferences;
import com.vkramarenko.procachaniytest.tasks.GetUrlOfImageFromGoogleTask;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 1 on 23.01.2017.
 * Provider for app
 */

public class Provider {

    public static final String TAG = "Provider";

    private static Provider sInstance;
    private ArrayList<String> urlList = new ArrayList<>();
    private GetUrlOfImageFromGoogle imageUrlRetrofitGetter;

    private Provider() {
        initializeRetrofit();
        urlList = new ArrayList<>();
    }

    public static Provider getInstance() {
        if (sInstance == null) {
            sInstance = new Provider();
        }
        return sInstance;
    }

    private void initializeRetrofit() {
        imageUrlRetrofitGetter = new Retrofit.Builder()
                .baseUrl(Preferences.DEFAULT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GetUrlOfImageFromGoogle.class);
    }

    public void getImages(String query, String startIndex) {
        final Call<Model> call = imageUrlRetrofitGetter.getImage(initializeQueryParams(query, startIndex));
        GetUrlOfImageFromGoogleTask getUrlOfImageFromGoogle = new GetUrlOfImageFromGoogleTask(call);
        getUrlOfImageFromGoogle.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private HashMap<String, String> initializeQueryParams(String query, String startIndex) {
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("key", Preferences.KEY_FROM_GOOGLE_SEARCH);
        queryParams.put("cx", Preferences.IDENTIFICATOR_FOR_SEARCH_SYSTEM);
        queryParams.put("q", query);
        queryParams.put("start", startIndex);
        return queryParams;
    }

    public ArrayList<String> getUrlList() {
        return urlList;
    }
}
