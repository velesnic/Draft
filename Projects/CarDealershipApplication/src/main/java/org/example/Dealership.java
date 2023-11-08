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
        boolean hasVehicles = false;
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minimum && vehicle.getPrice() <= maximum) {
                System.out.println(vehicle);
                hasVehicles = true;
            }
        }
        if (!hasVehicles) {
            System.out.println("There are no vehicles within that price range.");
        }
    }

    public void getVehiclesByMakeModel(String userMake, String userModel) {
        boolean hasVehicles = false;
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(userMake) && vehicle.getModel().equalsIgnoreCase(userModel)) {
                hasVehicles = true;
                System.out.println(vehicle);
            }
        }
        if (!hasVehicles) {
            System.out.println("No vehicles match the make and model given.");
        }
    }

    public void getVehiclesByYear(int minimum, int maximum){
        boolean hasVehicles = false;
        for(Vehicle vehicle : inventory){
            if(vehicle.getYear() >= minimum && vehicle.getYear() <= maximum){
                hasVehicles = true;
                System.out.println(vehicle);
            }
            if(!hasVehicles){
                System.out.println("No vehicles fit the dates given.");
            }
        }
    }

    public void getVehiclesByColor(String userColor){
        boolean hasVehicles = false;
        for(Vehicle vehicle : inventory){
            if(vehicle.getColor().equalsIgnoreCase(userColor)){
                hasVehicles = true;
                System.out.println(vehicle);
            }
            if(!hasVehicles){
                System.out.println("No vehicles with that color.");
            }
        }
    }

    public void getVehiclesByMileage(int minimum, int maximum){
        boolean hasVehicles = false;
        for(Vehicle vehicle : inventory){
            if(vehicle.getOdometer() >= minimum && vehicle.getOdometer() <= maximum){
                hasVehicles = true;
                System.out.println(vehicle);
            }
            if(!hasVehicles){
                System.out.println("No vehicles within that mileage.");
            }
        }
    }

    public void getVehiclesByType(String userVehicleType){
        boolean hasVehicles = false;
        for(Vehicle vehicle : inventory){
            if(vehicle.getVehicleType().equalsIgnoreCase(userVehicleType)){
                hasVehicles = true;
                System.out.println(vehicle);
            }
            if(!hasVehicles){
                System.out.println("No vehicles with that body type.");
            }
        }
    }

    public void getAllVehicles() {
        if (inventory.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (Vehicle vehicle : inventory) {
                System.out.println(vehicle);
            }
        }
    }

    public void addVehicle(Vehicle vehicle){
        try {
            inventory.add(vehicle);
        }
        catch(Exception ex){
            System.out.println("Error adding vehicle.");
            ex.printStackTrace();
        }

    }

    public void removeVehicle(Vehicle vehicle){
       try{
           inventory.remove(vehicle);
       }
       catch(Exception ex){
           System.out.println("Error removing vehicle.");
           ex.printStackTrace();
       }
    }

}
