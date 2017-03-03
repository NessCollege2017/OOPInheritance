package edu.tomer.java.terminal;

/**
 * Created by Android2017 on 03/03/2017.
 */
public class Passenger {
    //Properties:
    private String name;
    private double age;

    //constructor:
    public Passenger(String name, double age) {
        this.name = name;
        this.age = age;
    }
    //constructor:
    public Passenger() {
    }

    //business logic
    public String toString(){
        return "\nName: " + name +
                "\nAge: " +age;
    }

    public double priceToPay(double basicTicketPrice){
        return basicTicketPrice * 3;
    }









    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
}
