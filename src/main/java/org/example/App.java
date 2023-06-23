package org.example;

import org.example.Bird.Bird;
import org.example.panchi.Eagle;
import org.example.panchi.Sparrow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bird eagle = new Eagle ("Bhagwa Color", 10.9, "Horn-billed");
        eagle.fly ();
        Bird sparrow = new Sparrow ("Bhagwa Color", 9.0, "Horn");
        sparrow.fly ();
    }
}
