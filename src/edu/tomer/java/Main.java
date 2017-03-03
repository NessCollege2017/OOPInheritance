package edu.tomer.java;


import edu.tomer.java.terminal.Flight;
import edu.tomer.java.terminal.Passenger;
import edu.tomer.java.terminal.VIPPassenger;
import edu.tomer.java.zoo.Animal;
import edu.tomer.java.zoo.Cow;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();//now
        LocalDateTime localDateTime = LocalDateTime.of(2015, 2, 2, 0, 0);//input
        long yearDiff = localDateTime.until(now, ChronoUnit.YEARS);//diff


        ArrayList<Passenger> passengers = new ArrayList<>();

        //VIP
       VIPPassenger vipPassenger = new VIPPassenger("Hillary", 20, 0.1);


        //Regular Passenger
        Passenger moe = new Passenger("Moe", 22);

        //Add all passengers to the list, VIP's and regulars in the same list.
        passengers.add(moe);
        passengers.add(vipPassenger);

        //print all the list: (toString is known to JAVA)
        System.out.println(passengers);

        //init a flight, use polymorphysm to add the passengers using one method.
        Flight f = new Flight();
        f.bookFlight(vipPassenger);
        f.bookFlight(moe);
    }
}
