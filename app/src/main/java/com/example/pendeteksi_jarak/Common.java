package com.example.pendeteksi_jarak;

import com.example.pendeteksi_jarak.Model.DriverGeoModel;
import com.example.pendeteksi_jarak.Model.DriverInfoModel;
import com.google.android.gms.maps.model.Marker;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Common {
    public static final String DRIVER_INFO_REFERENCE = "DriverInfo";
    public static final String DRIVER_LOCATION_REFERENCES = "Location";

    public static DriverInfoModel currentUser;
    public static Set<DriverGeoModel> usersFound = new HashSet<DriverGeoModel>();
    public static HashMap<String, Marker> markerList = new HashMap<>();

    public static String builderWelcomeMessage() {
        if(Common.currentUser != null){
            return new StringBuilder("")
                    .append(Common.currentUser.getFirstName())
                    .append(" ")
                    .append(Common.currentUser.getLastName()).toString();
        }else{
            return "";
        }
    }

    public static String buildName(String firstName, String lastName) {
        return new StringBuilder(firstName).append(" ").append(lastName).toString();
    }
}
