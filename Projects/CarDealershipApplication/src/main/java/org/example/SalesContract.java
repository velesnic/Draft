package org.example;

public class SalesContract extends Contract {
    private boolean isFinanced;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold, boolean isFinanced) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.isFinanced = isFinanced;
    }
    public double getSalesTaxAmount(){
        return getVehicleSold().getPrice() * 0.05;
    }
    public double getRecordingFee(){
        return 100;
    }
    public double getProcessingFee(){
        if(getVehicleSold().getPrice() < 10000){
            return 295;
        }
        else{
            return 495;
        }
    }
    public boolean isFinanced() {
        return isFinanced;
    }
    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }
    public double getTotalPrice() {
        if (!isFinanced) {
            return getVehicleSold().getPrice() + getSalesTaxAmount() + getProcessingFee() +
                    getRecordingFee();
        } else {
            double r= 0.0425/12;
            double R = 0.0525/12;
            if (getVehicleSold().getPrice() >= 10000) {
                return (48 * (getVehicleSold().getPrice() * r * Math.pow(1 + r, 48))/ (Math.pow(1 + r, 48)-1)) +
                        getRecordingFee() + getProcessingFee() + getSalesTaxAmount();
            }
            else{
                return (24 * (getVehicleSold().getPrice() * R * Math.pow(1 + R, 24))/(Math.pow(1 + R, 24)-1)) +
                        getRecordingFee() + getProcessingFee() + getSalesTaxAmount();
            }

        }
    }

    public double getMonthlyPayment(){
            double P = getVehicleSold().getPrice();
            double r = 0.0425/12;
            double R = 0.0525/12;
            if(isFinanced && P>=10000){
                return (P*r*Math.pow(1+r,48))/(Math.pow(1+r,48)-1);
            }
            else if(isFinanced && P<10000){
                return (P*R*Math.pow(1+R,24))/(Math.pow(1+R,24)-1);
            }
            else{
                return 0;
            }
    }

}
