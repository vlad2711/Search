package com.vkramarenko.procachaniytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Newsarticle {

    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("articlebody")
    @Expose
    private String articlebody;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("usageterms")
    @Expose
    private String usageterms;
    @SerializedName("inlanguage")
    @Expose
    private String inlanguage;
    @SerializedName("datepublished")
    @Expose
    private String datepublished;
    @SerializedName("datemodified")
    @Expose
    private String datemodified;
    @SerializedName("articlesection")
    @Expose
    private String articlesection;
    @SerializedName("thumbnailurl")
    @Expose
    private String thumbnailurl;
    @SerializedName("copyrightnotice")
    @Expose
    private String copyrightnotice;
    @SerializedName("copyrightyear")
    @Expose
    private String copyrightyear;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUsageterms() {
        return usageterms;
    }

    public void setUsageterms(String usageterms) {
        this.usageterms = usageterms;
    }

    public String getInlanguage() {
        return inlanguage;
    }

    public void setInlanguage(String inlanguage) {
        this.inlanguage = inlanguage;
    }

    public String getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(String datepublished) {
        this.datepublished = datepublished;
    }

    public String getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(String datemodified) {
        this.datemodified = datemodified;
    }

    public String getArticlesection() {
        return articlesection;
    }

    public void setArticlesection(String articlesection) {
        this.articlesection = articlesection;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public String getCopyrightnotice() {
        return copyrightnotice;
    }

    public void setCopyrightnotice(String copyrightnotice) {
        this.copyrightnotice = copyrightnotice;
    }

    public String getCopyrightyear() {
        return copyrightyear;
    }

    public void setCopyrightyear(String copyrightyear) {
        this.copyrightyear = copyrightyear;
    }

}