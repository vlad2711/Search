package com.vkramarenko.procachaniytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sameas")
    @Expose
    private String sameas;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSameas() {
        return sameas;
    }

    public void setSameas(String sameas) {
        this.sameas = sameas;
    }

}