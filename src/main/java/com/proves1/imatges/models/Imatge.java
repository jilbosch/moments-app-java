package com.proves1.imatges.models;

public class Imatge {

    public String getImgUrl() {
        return imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescipcio() {
        return descipcio;
    }

    public Imatge(String imgUrl, String title, String descipcio) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.descipcio = descipcio;
    }

    private String imgUrl;
    private String title;
    private String descipcio;


    public Long getId() {
        return null;
    }
}
