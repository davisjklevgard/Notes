package IntroductionToDataStructuresAndAlgorithmsInJava.Hashtables;

public class ResolvingCollisionsThroughChaining {
    /*
        Solution to avoid collisions
            not to insert the data directly into array slot
            use a linked list for each slot
                if multiple keys map to same slot, the records are stored as a linked list
            This way is called chaining

        time:
            if all data has been mapped to single linked list O(n)
                linear time and that is not desired
            Average:
            n = number of keys
            m = number of slots
            a (alpha) = n/m also called load factor
            time = O(1+a) 1 is for the hash function call. and the load factor is the average length of the chain

            Time can remain constant if m is the same as n
     */
}
