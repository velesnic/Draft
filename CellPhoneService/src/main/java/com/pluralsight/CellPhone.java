package com.pluralsight;

public class CellPhone {


    private String serialNumber;

    private String model;

    private String carrier;

    private String phoneNumber;

    private String owner;

    public CellPhone (){
    this.serialNumber = serialNumber = "0";
    this.carrier = carrier = "";
    this.phoneNumber = phoneNumber = "" ;
    this.owner= owner = "";
    }

    //getters
    public String getSerialNumber (){
        return serialNumber;
    }

    public String getCarrier (){
        return carrier;
    }

    public String getPhoneNumber (){
        return phoneNumber;
    }

    public String getOwner (){
        return owner;
    }

    //setters
    public void setSerialNumber(String userSerialNumber){
        this.serialNumber = userSerialNumber;
    }

    public void setCarrier(String userCarrier){
        this.carrier = userCarrier;
    }

    public void setPhoneNumber(String userPhoneNumber){
        this.phoneNumber = userPhoneNumber;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }







}
