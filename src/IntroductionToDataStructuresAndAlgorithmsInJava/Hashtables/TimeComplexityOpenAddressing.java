package IntroductionToDataStructuresAndAlgorithmsInJava.Hashtables;

public class TimeComplexityOpenAddressing {
    /*
        Worst case: O(n)
            assuming that hashing is uniform or the key being hashed to a slot is independent of other keys that may have
            already been put in the table
            Why
                we go over each slot till we get the item or an empty slot
            very bad for worst case


        Average
            number of probe steps <= 1/(1-alpha(see ResolvingCollisionsThroughChaining)
    `       so table is 50% full a = .5, number of probes <= 2
            that is very fast
            table = 80%, a = .8, number of probes <= 5
     */
}
