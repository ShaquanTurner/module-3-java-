package com.company;

public class  Employee implements Payable {
    protected  String firstName;
    protected  String lastName;
    protected String socialSecurityNumber;

    public void setFirstName(String firstName) {
        firstName="Joe";
        this.firstName = firstName;



    }

    public String getFirstName() {return this.firstName;}

    public void setLastName(String lastName) {
        lastName ="Robinson";
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }


    @Override
    public double getPaymentAmount() {
        return 5000;
    }
}
