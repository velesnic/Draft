package org.example;

public class LeaseContract extends Contract {
    public LeaseContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
    }
    public double getExpectedEndingValue(){
        return getVehicleSold().getPrice() * 0.5;
    }
    public double getLeaseFee(){
        return getVehicleSold().getPrice() * 0.07;
    }
    public double getTotalPrice(){
        return getVehicleSold().getPrice() - getExpectedEndingValue() + getLeaseFee();
    }
    public double getMonthlyPayment(){
        return (getVehicleSold().getPrice() - getExpectedEndingValue())/ 36 +
                (getVehicleSold().getPrice() + getExpectedEndingValue()) * (4/2400);
    }

}
