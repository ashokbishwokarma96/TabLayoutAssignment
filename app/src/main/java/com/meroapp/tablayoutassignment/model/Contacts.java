package com.meroapp.tablayoutassignment.model;

public class Contacts {
    private String name,phoneNo;
    private int imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Contacts(String name, String phoneNo, int imageId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageId = imageId;
    }
}
