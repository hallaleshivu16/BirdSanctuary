package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bird Sanctuary !!");
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        Ostrich ostrich = new Ostrich();
        Flemingo flemingo = new Flemingo();
        Penguine penguine = new Penguine();

        BirdRepository birdRepo = new BirdRepository();

        birdRepo.addBirds(duck);
        birdRepo.addBirds(parrot);
        birdRepo.addBirds(ostrich);
        birdRepo.addBirds(flemingo);
        birdRepo.addBirds(penguine);
        UserInterface userInterface = new UserInterface();
        userInterface.print(birdRepo.getBirdList());

        birdRepo.removeBirds(duck);
        birdRepo.removeBirds(parrot);
        birdRepo.removeBirds(ostrich);
        System.out.println("Birds after Removal");
        userInterface.print(birdRepo.getBirdList());
    }
}
