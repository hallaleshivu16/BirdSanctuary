package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class BirdRepository {
    public static List birdList = new ArrayList();

    public static void addBirds(Duck duck) {
        birdList.add(duck);
    }

    public static void addBirds(Parrot parrot) {
        birdList.add(parrot);
    }

    public static void addBirds(Penguine penguine) {
        birdList.add(penguine);
    }

    public static void addBirds(Ostrich ostrich) {
        birdList.add(ostrich);
    }

    public static void addBirds(Flemingo flemingo) {
        birdList.add(flemingo);
    }

    public static List getBirdList() {
        return birdList;
    }

    public static void setBirdList(List birdList) {
        BirdRepository.birdList = birdList;
    }
    public void removeBirds(Duck duck) {
        birdList.remove(duck);
    }

    public static void removeBirds(Parrot parrot) {
        birdList.remove(parrot);
    }

    public static void removeBirds(Penguine penguine) {
        birdList.remove(penguine);
    }

    public static void removeBirds(Ostrich ostrich) {
        birdList.remove(ostrich);
    }

    public static void removeBirds(Flemingo flemingo) {
        birdList.remove(flemingo);
    }
}
