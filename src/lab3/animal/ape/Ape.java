package lab3.animal.ape;

import lab3.animal.Animal;

public class Ape extends Animal {
    private String size;

    public Ape(int noOfLegs, String name, String size)
    {
        super(name, noOfLegs); //call parent class constructor
        this.size = size;
    }

    //suprascriere metoda (overriding)
    @Override
    public void move() {
        System.out.println("I can jump!");
    }
}