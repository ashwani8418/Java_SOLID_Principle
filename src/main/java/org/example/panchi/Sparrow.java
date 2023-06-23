package org.example.panchi;

import org.example.Bird.Bird;
import org.example.panchi.Interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String color, Double weight, String beakType){
        super(color, weight, beakType);
    }

    @Override
    public void fly() {
        System.out.println ("Sparrow is flying....");
    }
}
