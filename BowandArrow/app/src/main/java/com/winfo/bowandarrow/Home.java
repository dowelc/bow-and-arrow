package com.winfo.bowandarrow;

import android.os.Parcel;
import android.os.Parcelable;

public class Home implements Parcelable {

    private String nickname;
    private int bedrooms;
    private int bathrooms;
    private double price;
    private String address;

    public String getNickname() {
        return nickname;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Home() {

    }

    // Parcelling part
    public Home(Parcel in){
        String[] data = new String[3];

        in.readStringArray(data);

        if (data.length > 0) {
            this.nickname = data[0];
            this.bedrooms = Integer.parseInt(data[1]);
            this.bathrooms = Integer.parseInt(data[2]);
            this.price = Double.parseDouble(data[3]);
            this.address = data[4];
        }
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {
                this.nickname,
                this.bedrooms + "",
                this.bathrooms + "",
                this.price + "",
                this.address
        });
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Home createFromParcel(Parcel in) {
            return new Home(in);
        }

        public Home[] newArray(int size) {
            return new Home[size];
        }
    };
}