package edu.tomer.java.basketball;

import edu.tomer.java.utils.IO;

import java.util.ArrayList;

/**
 * Created by Tomer on 07/03/2017.
 */
public class Team {
    //composition vs aggregation
    private ArrayList<Player> players = new ArrayList<>();
    private String name;


    //constructors:
    public Team(String name) {
        this.name = name;
    }

    //constructor:
    public Team() {
        name = IO.getString("Enter Team Name: ");
    }

    public void add(){
        System.out.println("Add player to " + name);
        int choice = IO.getInt(
                "1) Offence\n" +
                "2) Defence\n" +
                "3) Center"
        );

        switch (choice){
            case 1:
                players.add(new OffencePlayer());
                break;
            case 2:
                players.add(new DefencePlayer());
                break;
            case 3:
                players.add(new CenterPlayer());
                break;
        }
    }

    public void printAllThePlayers(){
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public int teamThrowFromThree(){
        int score = 0;
        for (Player p : players) {
            boolean didScore = p.throwFrom3();
            System.out.print(p.getFirstName() + " " );
            System.out.println(didScore?"Scored": "Missed...");
            score += didScore? 3 : 0;
        }
        return score;
    }

    public String getName() {
        return name;
    }
}
