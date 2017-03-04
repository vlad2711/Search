package com.vkramarenko.procachaniytest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imageobject {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("copyrightholder")
    @Expose
    private String copyrightholder;
    @SerializedName("contenturl")
    @Expose
    private String contenturl;
    @SerializedName("embedurl")
    @Expose
    private String embedurl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("datecreated")
    @Expose
    private String datecreated;
    @SerializedName("representativeofpage")
    @Expose
    private String representativeofpage;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("caption")
    @Expose
    private String caption;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCopyrightholder() {
        return copyrightholder;
    }

    public void setCopyrightholder(String copyrightholder) {
        this.copyrightholder = copyrightholder;
    }

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public String getEmbedurl() {
        return embedurl;
    }

    public void setEmbedurl(String embedurl) {
        this.embedurl = embedurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getRepresentativeofpage() {
        return representativeofpage;
    }

    public void setRepresentativeofpage(String representativeofpage) {
        this.representativeofpage = representativeofpage;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}