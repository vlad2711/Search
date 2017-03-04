package com.vkramarenko.procachaniytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("\"articlesection\"")
    @Expose
    private String articlesection;
    @SerializedName("datepublished")
    @Expose
    private String datepublished;
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("articlebody")
    @Expose
    private String articlebody;
    @SerializedName("datemodified")
    @Expose
    private String datemodified;
    @SerializedName("keywords")
    @Expose
    private String keywords;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArticlesection() {
        return articlesection;
    }

    public void setArticlesection(String articlesection) {
        this.articlesection = articlesection;
    }

    public String getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(String datepublished) {
        this.datepublished = datepublished;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getArticlebody() {
        return articlebody;
    }

    public void setArticlebody(String articlebody) {
        this.articlebody = articlebody;
    }

    public String getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(String datemodified) {
        this.datemodified = datemodified;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

}