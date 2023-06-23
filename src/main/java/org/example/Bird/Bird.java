package org.example.Bird;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract  class  Bird {

    private String color;
    private Double weight;
    private String beakType;

    public abstract void fly();
}
