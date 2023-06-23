package org.example.panchi;

import lombok.AllArgsConstructor;
import org.example.Bird.Bird;
import org.example.panchi.Interfaces.Swimable;

public class Penguin extends Bird implements Swimable {

    public Penguin(String color, Double weight, String beakType) {
        super (color, weight, beakType);
    }
    @Override
    public void swim(){
        System.out.println ("Penguin is Swimming....");
    }
}
