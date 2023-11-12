package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    public static void saveCustomerSale(String buyerDate, String buyerName, String buyerEmail,
                                               Vehicle vehicle, double salesTax, double recordingFee, double processingFee,
                                               double total, String isFinanced, double monthlyPayment) {
        try(FileWriter writer = new FileWriter("src/main/resources/receipt.txt", true)) {
            String receipt = String.format("Date: %s | Name : %s | Email: %s | VIN: %d | Year: %d | Make: %s | Model: %s | Type: %s " +
                            "| Color: %s | SalesTax: %.2f | RecordingFee: %.2f | ProcessingFee: %.2f | Total: %.2f | Financed: %s | MonthlyPayment: %.2f",
                    buyerDate, buyerName, buyerEmail, vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),
                    vehicle.getVehicleType(), vehicle.getColor(), salesTax, recordingFee, processingFee, total, isFinanced, monthlyPayment);

            writer.write(receipt + System.lineSeparator());
            System.out.println("Transaction saved successfully.");
        } catch(IOException ex) {
            System.out.println("Could not save customer information.");
        }
    }
    public static void saveCustomerLease(String buyerDate, String buyerName, String buyerEmail, Vehicle vehicle,
                                          double totalPrice, double expectedEndingValue, double leaseFee, double monthlyPayment ){
        try(FileWriter writer = new FileWriter("src/main/resources/receipt.txt", true)){
            String receipt = String.format("Date: %s | Name: %s | Email: %s | VIN: %d | Year: %d | Make: %s " +
                            "| Model: %s | Type: %s | Color: %s | Total: %.2f | EndingValue: %.2f | LeaseFee: %.2f | MonthlyPayment: %.2f",
                    buyerDate, buyerName, buyerEmail, vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),
                    vehicle.getVehicleType(), vehicle.getColor(), totalPrice, expectedEndingValue, leaseFee, monthlyPayment);

            writer.write(receipt + System.lineSeparator());
            System.out.println("Transaction saved successfully.");
        } catch(IOException ex){
            ex.printStackTrace();
            System.out.println("Could not save customer information.");
        }

    }
}
