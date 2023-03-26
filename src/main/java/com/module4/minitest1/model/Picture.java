package com.module4.minitest1.model;

public class Picture {

    private Long id;
    private String pictureCode;

    private double pictureHeight;

    private double pictureWidth;

    private String pictureMaterial;

    private String pictureDescribe;

    private double picturePrice;

    public Picture() {
    }

    public Picture(Long id, String pictureCode, double pictureHeight, double pictureWidth, String pictureMaterial, String pictureDescribe, double picturePrice) {
        this.id = id;
        this.pictureCode = pictureCode;
        this.pictureHeight = pictureHeight;
        this.pictureWidth = pictureWidth;
        this.pictureMaterial = pictureMaterial;
        this.pictureDescribe = pictureDescribe;
        this.picturePrice = picturePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode;
    }

    public double getPictureHeight() {
        return pictureHeight;
    }

    public void setPictureHeight(double pictureHeight) {
       this.pictureHeight = pictureHeight;
    }

    public double getPictureWidth() {
        return pictureWidth;
    }

    public void setPictureWidth(double pictureWidth) {
        this.pictureWidth = pictureWidth;
    }

    public String getPictureMaterial() {
        return pictureMaterial;
    }

    public void setPictureMaterial(String pictureMaterial) {
        this.pictureMaterial = pictureMaterial;
    }

    public String getPictureDescribe() {
        return pictureDescribe;
    }

    public void setPictureDescribe(String pictureDescribe) {
        this.pictureDescribe = pictureDescribe;
    }

    public double getPicturePrice() {
        return picturePrice;
    }

    public void setPicturePrice(double picturePrice) {
        this.picturePrice = picturePrice;
    }
}
