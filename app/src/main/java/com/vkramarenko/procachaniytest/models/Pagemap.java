package com.vkramarenko.procachaniytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pagemap {

    @SerializedName("cse_thumbnail")
    @Expose
    private List<CseThumbnail> cseThumbnail = null;
    @SerializedName("imageobject")
    @Expose
    private List<Imageobject> imageobject = null;
    @SerializedName("person")
    @Expose
    private List<Person> person = null;
    @SerializedName("metatags")
    @Expose
    private List<Metatag> metatags = null;
    @SerializedName("videoobject")
    @Expose
    private List<Videoobject> videoobject = null;
    @SerializedName("cse_image")
    @Expose
    private List<CseImage> cseImage = null;
    @SerializedName("newsarticle")
    @Expose
    private List<Newsarticle> newsarticle = null;
    @SerializedName("hcard")
    @Expose
    private List<Hcard> hcard = null;
    @SerializedName("organization")
    @Expose
    private List<Organization> organization = null;
    @SerializedName("article")
    @Expose
    private List<Article> article = null;
    @SerializedName("breadcrumb")
    @Expose
    private List<Breadcrumb> breadcrumb = null;

    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    public List<Imageobject> getImageobject() {
        return imageobject;
    }

    public void setImageobject(List<Imageobject> imageobject) {
        this.imageobject = imageobject;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public List<Metatag> getMetatags() {
        return metatags;
    }

    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    public List<Videoobject> getVideoobject() {
        return videoobject;
    }

    public void setVideoobject(List<Videoobject> videoobject) {
        this.videoobject = videoobject;
    }

    public List<CseImage> getCseImage() {
        return cseImage;
    }

    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    public List<Newsarticle> getNewsarticle() {
        return newsarticle;
    }

    public void setNewsarticle(List<Newsarticle> newsarticle) {
        this.newsarticle = newsarticle;
    }

    public List<Hcard> getHcard() {
        return hcard;
    }

    public void setHcard(List<Hcard> hcard) {
        this.hcard = hcard;
    }

    public List<Organization> getOrganization() {
        return organization;
    }

    public void setOrganization(List<Organization> organization) {
        this.organization = organization;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }

    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

}