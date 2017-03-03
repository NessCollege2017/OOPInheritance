package edu.tomer.java.zoo;

/**
 * Created by Android2017 on 03/03/2017.
 */
public class Animal {
    private final String name;// immutable (final)
    private final String species; // immutable (final / const)
    //private - Only from this class...

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String toString(){
        return "Name: " + name +
                "\nSpecies: " + species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
