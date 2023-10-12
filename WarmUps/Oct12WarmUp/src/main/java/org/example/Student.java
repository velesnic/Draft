package org.example;

public class Student {

private String firstName;

private String lastName;

private String idNumber;

private int yearInSchool;

private boolean isInternationalStudent;

private String addressOfStudent;

public Student (String firstName, String lastName, String idNumber, int yearInSchool, boolean isInternationalStudent, String addressOfStudent){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.yearInSchool = yearInSchool;
    this.isInternationalStudent = isInternationalStudent;
    this.addressOfStudent = addressOfStudent;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getYearInSchool() {
        return yearInSchool;
    }

    public void setYearInSchool(int yearInSchool) {
        this.yearInSchool = yearInSchool;
    }

    public boolean isInternationalStudent() {
        return isInternationalStudent;
    }

    public void setInternationalStudent(boolean internationalStudent) {
        isInternationalStudent = internationalStudent;
    }

    public String getAddressOfStudent() {
        return addressOfStudent;
    }

    public void setAddressOfStudent(String addressOfStudent) {
        this.addressOfStudent = addressOfStudent;
    }

    public Student (String firstName, String lastName, String idNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
    }

    public void Greeting (){
        System.out.println("Hi my name is " + firstName + " " + lastName + "!");
    }







}
