package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class DealershipFileManager {

    private Dealership dealership;

    public Dealership getDealership() {
        ArrayList<Vehicle> inventory = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/inventory.csv");
            Scanner scanner = new Scanner(fileInputStream);
            scanner.nextLine();
            String input;
            while(scanner.hasNextLine()){
                input = scanner.nextLine();
                String [] rowArray = input.split("\\|");

                int vin = Integer.parseInt(rowArray[0].trim());
                int year = Integer.parseInt(rowArray[1].trim());
                String make = rowArray[2];
                String model = rowArray[3];
                String vehicleType = rowArray[4];
                String color = rowArray[5];
                int odometer = Integer.parseInt(rowArray[6].trim());
                double price = Double.parseDouble(rowArray[7].trim());
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                inventory.add(vehicle);
                dealership.addVehicle(vehicle);
            }
            fileInputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Could not locate file.");
            ex.printStackTrace();
        }
        catch(IOException ex){
            System.out.println("Could not locate file.");
            ex.printStackTrace();
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership){
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/inventory.csv");
            ArrayList<Vehicle> inventory = dealership.getInventory();
                for(Vehicle vehicle : inventory){
                    fileWriter.write(vehicle.getVin() + " | " + vehicle.getYear() + " | " + vehicle.getMake() +
                            " | " + vehicle.getModel() + " | " + vehicle.getVehicleType() + " | " + vehicle.getColor() +
                            " | " + vehicle.getOdometer() + " | " + vehicle.getPrice() + "\n");
                }
                fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Couldn't locate file.");
            ex.printStackTrace();
        }
    }

}