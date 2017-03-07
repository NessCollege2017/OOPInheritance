package edu.tomer.java.basketball;

import edu.tomer.java.utils.IO;

import java.time.LocalDateTime;

/**
 * Created by Tomer on 07/03/2017.
 */
public class CenterPlayer extends Player{
    private static String category = "Center";
    //properties:
    private double numOfPasses;

    //constructor:
    public CenterPlayer(String firstName, LocalDateTime birthDate, Float height, int shirtNumber, int pctFromTheLine, int pctFromTheField, int pctFromThree,  double numOfPasses) {
        super(firstName, birthDate, height, shirtNumber, pctFromTheLine, pctFromTheField, pctFromThree, CenterPlayer.category);
        this.numOfPasses = numOfPasses;
    }

    //constructor:
    public CenterPlayer() {
        super();
        numOfPasses = IO.getDouble("Enter Num of passes: ");
        setCategory(category);

    }

    //public API:
    public void pass(){
        System.out.println("Passing");
    }
    @Override
    public String toString() {
        return super.toString() +  "\n" +
                "CenterPlayer{" +
                "numOfPasses=" + numOfPasses +
                '}';
    }

    //getters and setters:
    public double getNumOfPasses() {
        return numOfPasses;
    }

    public void setNumOfPasses(double numOfPasses) {
        this.numOfPasses = numOfPasses;
    }
}
