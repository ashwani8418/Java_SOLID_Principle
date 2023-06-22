package org.example.Bird;

public class Bird {

    private String color;
    private Double weight;
    private BirdType type;
    private String beakType;

    public void fly(){
        if(type == BirdType.EAGLE){
            System.out.println ("Eagle is flying");
        }
        else if(type == BirdType.SPARROW){
            System.out.println ("Sparrow is flying");
        }
    }
}
