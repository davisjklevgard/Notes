package IntroductionToDataStructuresAndAlgorithmsInJava.Recursion;

public class TowerOfHanoiImplementation {
    public void move(int n, char from, char to, char inter) {
        if (n == 1) {
            System.out.println("Moving Disc 1 from " + from + " to " + to);
        }   else {

            move(n - 1, from, inter, to);
            System.out.println("Moving disc " + n + " from " + from + " to " + to);
            move(n - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoiImplementation toh = new TowerOfHanoiImplementation();
        toh.move(2,'A', 'C', 'B');
    }
}
