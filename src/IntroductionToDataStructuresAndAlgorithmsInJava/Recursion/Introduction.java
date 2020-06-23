package IntroductionToDataStructuresAndAlgorithmsInJava.Recursion;

public class Introduction {
    /*
        Euclid's Algorithm is a recursive algorithm as it calls itself

        Recursion
            when a method calls itself from within the same method

        Breaking Condition:
            Very important to have one in recursive calls
            a statement that will close the method and has the program moves past it.

        Factorial of a Method
            factorial(n) = n*(n-1)*(n-2)*.....1
            factorial(n) = n *factorial(n-1)

            Iterative Way
                public in factorial (int N) {
                    int result = 1;
                    for (int i = 1; i <= n; i++) {
                        result *= i;
                    }
                    return result;
                }

            Recursive Way
                public static int factorial (int n) {
                    if(n == 0) return 1;
                    return n*factorial(n-1);
                }

        Comparing
        the recursive way makes the problems concise and clean or easier to understand
        the iterative way performs better in term of how fast it runs or how much memory is consumed
        recursion may cause stack overflow errors
     */

    public static int factorial (int n) {
        if (n == 0) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(3));
    }
}
