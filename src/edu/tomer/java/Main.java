package edu.tomer.java;


import edu.tomer.java.basketball.Team;

public class Main {

    public static void main(String[] args) {
        Team t = new Team("Chicago");
        Team t2 = new Team("HBS");

        for (int i = 0; i < 1; i++) {
            t.add();
            t2.add();
        }

        t.teamThrowFromThree();
        t2.teamThrowFromThree();

    }
}
