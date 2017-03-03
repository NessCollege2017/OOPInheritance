package edu.tomer.java.terminal;

/**
 * Created by Android2017 on 03/03/2017.
 */
public class VIPPassenger extends Passenger {
    //properties:
    private double extraDiscount;

    //constructors:
    public VIPPassenger() {
        super();

    }

    public VIPPassenger(String name, double age, double extraDiscount) {
        super(name, age);
        this.extraDiscount = extraDiscount;
    }

    //BL methods:
    @Override
    public double priceToPay(double basicTicketPrice) {
        double daddy = super.priceToPay(basicTicketPrice);
        return daddy * (1 - extraDiscount);
    }

    @Override
    public String toString() {
        return "\n"+ super.toString() + "\nExtra Discount: " + extraDiscount;
    }

    //Getters and Setters:
    public double getExtraDiscount() {
        return extraDiscount;
    }
    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }
}
