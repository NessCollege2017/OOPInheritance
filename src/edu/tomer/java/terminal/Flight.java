package edu.tomer.java.terminal;

import java.util.ArrayList;

/**
 * Created by Android2017 on 03/03/2017.
 */
public class Flight {
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public void bookFlight(Passenger p){
        //deal with special cases
        passengers.add(p);
    }

    /*
    Duplicate code
    public void bookFlight(VIPPassenger p){
        passengers.add(p);
    }
    */

}
