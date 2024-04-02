package lab3.animal.bird;

import lab3.animal.Animal;

public class Bird extends Animal {
    private String colour;

    public Bird(int noOfLegs, String name, String colour) {
        super(name, noOfLegs); //call parent class constructor
        this.colour = colour;
    }

    //suprascriere metoda (overriding)
    @Override
    public void move() {
        System.out.println("I can fly!");
    }

    public void sing(){
        System.out.println("I can chirp!");
    }
    public String getColour() {return colour;}
    public void setColour(String colour) {
        this.colour = colour;
    }
}
