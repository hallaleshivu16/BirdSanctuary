package com.bridgelabz;

public class Bird {
    String colour;
    String name;
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats Chilly");
    }

    public void fly() {
        System.out.println(getClass().getSimpleName() + " can fly");
    }

    public void swim() {
        System.out.println(getClass().getSimpleName() + " can Swim");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
