package IntroductionToDataStructuresAndAlgorithmsInJava.Hashtables;

import java.util.Hashtable;

public class Hashing {
    /*
        Hashing
            A way to map the keys of any type
            either a string or object
            to a random array index

           to do so will allow us to store data associated with the key into a corresponding array index

       Hash Function
        maps keys "randomly" into slots (array indices) of table T (array)

        Problem
            A key that is mapped to a previously already mapped spot
            this is considered a collision
        Solution
            brought up in next video Resolving collisions through chaining
     */
    //Found at https://www.geeksforgeeks.org/hashing-in-java/
    public static void main(String[] args) {
        // Create a HashTable to store
        // String values corresponding to integer keys
        Hashtable<Integer, String>
                hm = new Hashtable<Integer, String>();

        // Input the values
        hm.put(1, "Geeks");
        hm.put(12, "forGeeks");
        hm.put(15, "A computer");
        hm.put(3, "Portal");

        // Printing the Hashtable
        System.out.println(hm);

    }
}
