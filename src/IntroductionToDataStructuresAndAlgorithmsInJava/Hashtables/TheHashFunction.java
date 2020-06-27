package IntroductionToDataStructuresAndAlgorithmsInJava.Hashtables;

public class TheHashFunction {
    /*
        Hash Function
            good one should
                distribute keys uniform;y into slots
                Keys are natural numbers
                    0, 1, 2, ...
        How to make a key
            one way is to add up all the numbers that make up the string
                however that may lead to data be used at the same spot
            Another way is to use a radix to make the unique key.
                The number will be the weight of the key
            Either way we need to override the hash code method to use objects of our own custom class to make keys
            inside a set or map

        Process of inserting an object in a set or as a key
            1. Java calls the hash code method and hashes a detail value into another integer which can be used directly
                as an area index
        Easy way to put a key in an array
        n=25 m= 25
        h(k) = k % m
        h(501) = 501 % 25 = 1

        This method of hashing is called method of division
             quick and dirty way to hash
             there are better methods that are practically used
             used because it is easy

        Chaining can fix any problems that come from collisions
     */
}
