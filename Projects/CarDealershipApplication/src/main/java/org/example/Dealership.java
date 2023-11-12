package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public void getVehiclesByPrice(double minimum, double maximum) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minimum && vehicle.getPrice() <= maximum) {
                System.out.println(vehicle);
            }
        }
    }

    public void getVehiclesByMakeModel(String userMake, String userModel) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(userMake) && vehicle.getModel().equalsIgnoreCase(userModel)) {
                System.out.println(vehicle);
            }
        }
    }

    public void getVehiclesByYear(int minimum, int maximum){
        for(Vehicle vehicle : inventory){
            if(vehicle.getYear() >= minimum && vehicle.getYear() <= maximum){
                System.out.println(vehicle);
            }
        }
    }

    public void getVehiclesByColor(String userColor){
        for(Vehicle vehicle : inventory){
            if(vehicle.getColor().equalsIgnoreCase(userColor)){
                System.out.println(vehicle);
            }
        }
    }

    public void getVehiclesByMileage(int minimum, int maximum){
        for(Vehicle vehicle : inventory){
            if(vehicle.getOdometer() >= minimum && vehicle.getOdometer() <= maximum){
                System.out.println(vehicle);
            }
        }
    }

    public void getVehiclesByType(String userVehicleType){
        for(Vehicle vehicle : inventory){
            if(vehicle.getVehicleType().equalsIgnoreCase(userVehicleType)){
                System.out.println(vehicle);
            }
        }
    }

    public void getAllVehicles() {
            for (Vehicle vehicle : inventory) {
                System.out.println(vehicle);
            }
    }

    public void addVehicle(Vehicle vehicle){
            inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
           inventory.remove(vehicle);
    }

}
