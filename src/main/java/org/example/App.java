package org.example;

import org.example.Bird.Bird;
import org.example.panchi.Eagle;
import org.example.panchi.Interfaces.Flyable;
import org.example.panchi.Sparrow;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Eagle eagle = new Eagle ("Bhagwa Color", 10.9, "Horn-billed");
        Sparrow sparrow = new Sparrow ("Bhagwa Color", 9.0, "Horn");
        List<Flyable> flyableBird = List.of (eagle, sparrow);
        flyableBird.forEach (Flyable::fly);
    }
}
