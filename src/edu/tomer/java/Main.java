package edu.tomer.java;


import edu.tomer.java.basketball.Team;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Team t = new Team("Chicago");
        Team t2 = new Team("HBS");

        for (int i = 0; i < 1; i++) {
            t.add();
            t2.add();
        }

        int tScore = t.teamThrowFromThree();
        int t2Score = t2.teamThrowFromThree();

        if (tScore > t2Score)
            System.out.println(t.getName() + " Wins");
        else if (t2Score>tScore)
            System.out.println(t.getName() + " Wins");
        else System.out.println("Tie");
    }
}
