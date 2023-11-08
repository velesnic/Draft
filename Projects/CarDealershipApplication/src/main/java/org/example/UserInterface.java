package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    public UserInterface(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
        display();
    }

    public void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Velesnic Auto Company. Please select an option.");
        boolean isOnline= true;
        while(isOnline){
            try{
                System.out.println("1. Search Vehicles by Price.");
                System.out.println("2. Search Vehicles by Make/Model.");
                System.out.println("3. Search Vehicles by Year.");
                System.out.println("4. Search Vehicles by Color.");
                System.out.println("5. Search Vehicles by Mileage.");
                System.out.println("6. Search Vehicles by Body Type.");
                System.out.println("7. Display All Vehicles.");
                System.out.println("8. Add a New Vehicle.");
                System.out.println("9. Remove a Vehicle.");
                System.out.println("99. Exit Application.");
                System.out.println("Select a choice from 1-9, or 99.");
                int userChoice = scanner.nextInt();
                switch(userChoice){
                    case 1:
                        processGetByPriceRequest(dealership.getInventory());
                        break;
                    case 2:
                       processGetByMakeModelRequest(dealership.getInventory());
                        break;
                    case 3:
                        processGetByYearRequest(dealership.getInventory());
                        break;
                    case 4:
                        processGetByColorRequest(dealership.getInventory());
                        break;
                    case 5:
                        processGetByMileageRequest(dealership.getInventory());
                        break;
                    case 6:
                        processGetByVehicleTypeRequest(dealership.getInventory());
                        break;
                    case 7:
                        processGetAllVehicleRequest(dealership.getInventory());
                        break;
                    case 8:
                        processAddVehicleRequest(dealership.getInventory());
                        break;
                    case 9:
                        processRemoveVehicleRequest(dealership.getInventory());
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter a valid choice.");
                }

            }
            catch(Exception ex){
                System.out.println("Could not complete Request.");
                ex.printStackTrace();
                }
        }



    }

    public void processGetByPriceRequest(ArrayList<Vehicle> inventory) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Minimum: ");
                double minimum = scanner.nextDouble();
                System.out.println("Maximum: ");
                double maximum = scanner.nextDouble();
                dealership.getVehiclesByPrice(minimum, maximum);
                isValid = true;
            } catch (Exception ex) {
                System.out.println("Please enter a valid input.");
            }
        }
    }

    public void processGetByMakeModelRequest(ArrayList<Vehicle> inventory) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Make:");
                String userMake = scanner.nextLine().trim();
                System.out.println("Model:");
                String userModel = scanner.nextLine().trim();
                boolean hasVehicles = false;
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getMake().trim().equalsIgnoreCase(userMake) || vehicle.getModel().trim().equalsIgnoreCase(userModel)) {
                        hasVehicles = true;
                        System.out.println(vehicle);
                    }
                }
                if (!hasVehicles) {
                    System.out.println("No vehicles match the make or model given.");
                }
                break;
            } catch (Exception ex) {
                System.out.println("Please enter a valid input.");
            }
        }
    }


    public void processGetByYearRequest(ArrayList<Vehicle> inventory) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Minimum: ");
                int minimum = scanner.nextInt();
                System.out.println("Maximum:");
                int maximum = scanner.nextInt();
                dealership.getVehiclesByYear(minimum, maximum);
                isValid = true;
            } catch (Exception ex) {
                System.out.println("Please enter a valid input.");
                scanner.nextLine();
            }
        }
    }


    public void processGetByColorRequest(ArrayList<Vehicle> inventory) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Color:");
                String userColor = scanner.nextLine();
                boolean found = false;
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getColor().trim().equalsIgnoreCase(userColor)) {
                        System.out.println(vehicle);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No vehicles with that color.");
                }
                isValid = true;
            } catch (Exception ex) {
                System.out.println("Please enter a valid input.");
            }
        }
    }



    public void processGetByMileageRequest(ArrayList<Vehicle> inventory) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Minimum:");
                int minimum = scanner.nextInt();
                System.out.println("Maximum:");
                int maximum = scanner.nextInt();
                boolean found = false;
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getOdometer() >= minimum && vehicle.getOdometer() <= maximum) {
                        System.out.println(vehicle);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No vehicles within that mileage.");
                }
                isValid = true;
            } catch (Exception ex) {
                System.out.println("Please enter a valid input.");
            }
        }
    }


    public void processGetByVehicleTypeRequest(ArrayList<Vehicle> inventory) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Body Type:");
                String userVehicleType = scanner.nextLine();
                boolean found = false;
                for (Vehicle vehicle : inventory) {
                    if (vehicle.getVehicleType().trim().equalsIgnoreCase(userVehicleType)) {
                        System.out.println(vehicle);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No vehicles with that body type.");
                }
                isValid = true;
            } catch (Exception ex) {
                System.out.println("Please enter a valid input.");
            }
        }
    }


    public void processGetAllVehicleRequest(ArrayList<Vehicle> inventory){
        dealership.getAllVehicles();
    }

    public void processAddVehicleRequest(ArrayList<Vehicle> inventory){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vin: ");
            int newVin = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Year:");
            int newYear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Make:");
            String newMake = scanner.nextLine();
            System.out.println("Model:");
            String newModel = scanner.nextLine();
            System.out.println("Body Type:");
            String newBodyType = scanner.nextLine();
            System.out.println("Color:");
            String newColor = scanner.nextLine();
            System.out.println("Odometer:");
            int newOdometer = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Price:");
            double newPrice = scanner.nextDouble();
            scanner.nextLine();
            Vehicle newVehicle = new Vehicle(newVin, newYear, newMake, newModel, newBodyType, newColor, newOdometer, newPrice);
            dealership.addVehicle(newVehicle);

        }
        catch(Exception ex){
            System.out.println("Please enter valid information.");
        }
    }

    public void processRemoveVehicleRequest(ArrayList<Vehicle> inventory){
        try{
            System.out.println("Vin:");
            Scanner scanner = new Scanner(System.in);
            int userVin = scanner.nextInt();
            boolean found = false;
            for(Vehicle vehicle : dealership.getInventory()) {
                if (userVin == vehicle.getVin()) {
                    dealership.removeVehicle(vehicle);
                    System.out.println("Vehicle successfully removed.");
                    found = true;
                    break;
                }
            }
            if(!found){
                    System.out.println("No vehicle found.");
                }
        }
        catch(Exception ex){
            System.out.println("Please enter a valid input.");
        }

    }

}
