package com.tarento.javasample;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<mammals> m = new ArrayList<mammals>();
        m.add(new mammals("Elephant", 200));
        m.add(new mammals("Monkey", 30));
        m.add(new mammals("Fox", 20));
        m.add(new mammals("Lion", 50));
        m.add(new mammals("Panda", 30));


        // Call the sort function
//        Collections.sort(m);
        for (mammals mammals : m) {

            // Print the sorted ArrayList
            System.out.println(mammals.name + " " + mammals.weight);

        }

    }
}
