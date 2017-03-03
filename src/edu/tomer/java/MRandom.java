package edu.tomer.java;

import java.util.Random;

/**
 * Created by Android2017 on 03/03/2017.
 */
public class MRandom extends Random {

    public int nextInt(int from, int to){
      return nextInt(to-from) + from;
    }

    @Override
    public int nextInt() {
        return super.nextInt();
    }

    @Override
    public String toString() {
        return "MRandom";
    }
}
