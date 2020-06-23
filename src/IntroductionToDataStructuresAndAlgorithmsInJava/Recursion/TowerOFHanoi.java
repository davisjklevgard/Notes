package IntroductionToDataStructuresAndAlgorithmsInJava.Recursion;

public class TowerOFHanoi {
    /*
        Tower of Hanoi
            Three towers, certain number of disks on tower A. To complete this puzzle one must move all of the disks from
            tower A to tower C. However, you can only move one disk at a time and a larger disk cannot be placed on a
            smaller one.

            Three disk example:
                all three disks are on tower A. small to large is 1, 2, 3. The order to transfer those from a to C
                1 to C
                2 to B
                1 to B
                3 to C
                1 to A
                2 to C
                1 to C
            If we were to do this iteratively, then the program would become really complex Recursion makes this easier

            EX:
            move (n,'A', 'C', 'B')
                move (n - 1, 'A', 'B', 'C')
                Print "Moving disc n from A to C"
                move (n-1, 'B', 'C', 'A')
     */
}
