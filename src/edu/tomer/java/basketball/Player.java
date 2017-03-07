package edu.tomer.java.basketball;

import edu.tomer.java.utils.DateUtils;
import edu.tomer.java.utils.IO;
import edu.tomer.java.utils.RandomUtils;

import java.time.LocalDateTime;

/**
 * Created by Tomer on 03/03/2017.
 */
 class Player {
    private String firstName;
    private LocalDateTime birthDate;
    private Float height = 20.0F;
    private int shirtNumber;
    private int pctFromTheLine;
    private int pctFromTheField;
    private int pctFromThree;
    private String category;

    //Constructors:
    public Player(String firstName, LocalDateTime birthDate, Float height,  int shirtNumber, int pctFromTheLine, int pctFromTheField, int pctFromThree, String category) {
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.height = height;

        this.shirtNumber = shirtNumber;
        this.pctFromTheLine = pctFromTheLine;
        this.pctFromTheField = pctFromTheField;
        this.pctFromThree = pctFromThree;
        this.category = category;
    }
    public Player() {
        this.firstName = IO.getString("Enter First Name: ");
        this.birthDate = DateUtils.getDate("Enter birth date:");
        this.height = IO.getFloat("Enter Height:");
        this.shirtNumber = IO.getInt("Enter Shirt Number:");
        this.pctFromTheLine =  IO.getInt("Enter Pct from the line:");
        this.pctFromTheField = IO.getInt("Enter Pct from the Field:");
        this.pctFromThree =  IO.getInt("Enter Pct from the Three:");
        this.category = "Player";
    }

    //public API:
    //application program interface:
    public void dribble(){
        System.out.println("Dribbling");
    }

    public boolean throwFrom2(){
        int r = RandomUtils.nextRandom(0, 100);
        return r < pctFromTheField;
    }

    public boolean throwFrom3(){
        int r = RandomUtils.nextRandom(0, 100);
        return r < pctFromThree;
    }

    public boolean throwFromLine(){
        int r = RandomUtils.nextRandom(0, 100);
        return r < pctFromTheLine;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", shirtNumber=" + shirtNumber +
                ", pctFromTheLine=" + pctFromTheLine +
                ", pctFromTheField=" + pctFromTheField +
                ", pctFromThree=" + pctFromThree +
                ", category='" + category + '\'' +
                '}';
    }

    //getters and setters:
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getPctFromTheLine() {
        return pctFromTheLine;
    }

    public void setPctFromTheLine(int pctFromTheLine) {
        this.pctFromTheLine = pctFromTheLine;
    }

    public int getPctFromTheField() {
        return pctFromTheField;
    }

    public void setPctFromTheField(int pctFromTheField) {
        this.pctFromTheField = pctFromTheField;
    }

    public int getPctFromThree() {
        return pctFromThree;
    }

    public void setPctFromThree(int pctFromThree) {
        this.pctFromThree = pctFromThree;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
