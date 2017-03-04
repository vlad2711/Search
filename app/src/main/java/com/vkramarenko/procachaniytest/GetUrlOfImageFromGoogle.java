package com.vkramarenko.procachaniytest;

import com.vkramarenko.procachaniytest.models.Model;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


/**
 * Created by 1 on 03.01.2017.
 * GET interface
 */

public interface GetUrlOfImageFromGoogle {

    @GET("/customsearch/v1")
    Call<Model> getImage(@QueryMap Map<String, String> map);

}
