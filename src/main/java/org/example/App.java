package org.example;

import org.example.Bird.Bird;
import org.example.panchi.Eagle;
import org.example.panchi.Interfaces.Flyable;
import org.example.panchi.Interfaces.Swimable;
import org.example.panchi.Penguin;
import org.example.panchi.Sparrow;
import org.example.panchi.Swan;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Eagle eagle = new Eagle ("RedBlack", 10.9, "Horn-billed");
        Sparrow sparrow = new Sparrow ("Grey", 9.0, "Horn");
        Penguin penguin = new Penguin ("BlackWhite", 90.0, "Horn");
        Swan swan = new Swan ("White", 1.0, "Horn");
        List<Flyable> flyableBird = List.of (eagle, sparrow, swan);
        List<Swimable> swimableBird = List.of (penguin, swan);
        flyableBird.forEach (Flyable::fly); //Lambda method ---> Reference method
        swimableBird.forEach(Swimable::swim);

    }
}
