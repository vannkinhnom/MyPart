package com.example.drinkpart;

public class ImageAndString {
    private int imageRes;
    private String name;

    public ImageAndString(int imageRes, String name) {
        this.imageRes = imageRes;
        this.name = name;


    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
