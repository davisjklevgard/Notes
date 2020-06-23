package IntroductionToDataStructuresAndAlgorithmsInJava.Recursion;

public class TailRecursion {
    /*
        Tail Recursion
            another type of recursion that can avoid overflow errors
            EX:
                public int factorial (int n, int result) {
                    if (n == 0) return result;
                    return factorial (n - 1, n * result);
                }
            this method is usually overloading to produce a result
                factorial (int n) {
                    return factorial (n,1);
                }
        Accumulator
            a result parameter that accumulates the value of previous calculations

        This method in Java will still run as though it is a head recursion, with stacks. Other programs will be able to
        do what tail recursion is meant for
     */
}
