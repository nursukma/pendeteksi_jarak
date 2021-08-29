package com.example.pendeteksi_jarak.Model.EventBus;

public class UserRequest {
    private String key, pickUpLocation;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public UserRequest(String key, String pickUpLocation) {
        this.key = key;
        this.pickUpLocation = pickUpLocation;
    }
}
