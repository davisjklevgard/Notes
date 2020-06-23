package IntroductionToDataStructuresAndAlgorithmsInJava.Recursion;

public class UnderstandingRecursion {
    /*
        Method Stack or Call Stack
            a program's runtime will create this to keep track of local variables or expressions, evaluations etc
            in the context of recursion methods it is called a recursion stack

        Using a previous recursive method, oe can understand recursive stacks
        the program will start with the number given and go into the algorithm and give an answer that is put into the
        stack. the number is subtracted by one and the process repeats itself until n reaches 0 which has a factorial of
        1. then all of the previous values are popped and tha numbers return results till you reach the last one

        If you forget a breaking method, then the method will not end.

        An overflow error can still happen if the recursive call is too deep, ie you give a number that is too large for
        the program
     */
}
