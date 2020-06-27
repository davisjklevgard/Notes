package IntroductionToDataStructuresAndAlgorithmsInJava.Hashtables;

public class StrategiesForOpenAddressing {


    /*
            How use Open Addressing
               linear probing
                start from base probe step that is 0
                hit an index
                if full just go to next index till you get an empty slot
                expression: h(k,i) = (h(k,0)+i) % m
                m = table size
                Problem
                    clustering of records

                Quadratic Probing
                    use a quadratic function
                    hit an index
                    if full add 1^2, then 2^2, 3^2 and so on till empty
                    expression: h(k,i) = (h(k,0)+i^2) % m

                Double Hashing
                    most practical
                    uses two different hash functions
                    works very well
                    expression: h(k,i) = (h1(k)+ih2(k)) % m
         */
    //https://www.sanfoundry.com/java-program-implement-hash-table-with-double-hashing/
    //function for double hashing
   /* private static final Object TABLE_SIZE = 100;
    private int myHash2(String x) {
        int hashVal = 0;
        hashVal %= TABLE_SIZE;
        if (hashVal < 0)
            hashVal += TABLE_SIZE;
        int primeSize;
        return primeSize -hashVal % primeSize
    }*/
}
