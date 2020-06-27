package IntroductionToDataStructuresAndAlgorithmsInJava.Heaps;

public class BuildingAHeap {
    /*
        here is a way to make a heap
            given numbers: 8 3 5 7 2 15 17 19
            8 is first so it goes to index 0
            3 is next and goes to index 1
            5 to index 2
            7 first to index 3, switches with number 3 to index 1
            2 to index 4
            15 to index 5, switch with 5 to index 2, swith with 8 to index 0
            17 to index 6, to index 2, to index 0
            19 to index 7, to index 3, to index 1, to index 0

        Heap
         19
         17
         15
         7
         2
         5
         8
         3

        Time: O(nlogn)
     */

    //Found at Geeks for Geeks
    static void printArray (int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    //Driver program
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 7, 2, 15, 17, 19};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
