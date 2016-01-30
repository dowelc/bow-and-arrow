package com.winfo.bowandarrow;

public class Home {

    private String nickname;
    private int bedrooms;
    private int bathrooms;
    private int price;

    public String getNickname() {
        return nickname;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getPrice() {
        return price;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}