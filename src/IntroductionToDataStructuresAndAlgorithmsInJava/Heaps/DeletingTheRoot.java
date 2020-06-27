package IntroductionToDataStructuresAndAlgorithmsInJava.Heaps;

public class DeletingTheRoot {
    /*
        so when deleting a root, one will use the last node to swap and replace the root node. However it will be smaller
        than the two child roots. The program will then swap with the largest child node. This will continue till the
        node is in a good place for it to be.


        Found at https://www.tutorialspoint.com/data_structures_algorithms/heap_data_structure.htm#:~:text=Max%20Heap%20Deletion%20Algorithm&text=Deletion%20in%20Max%20(or%20Min,child%20node%20with%20its%20parent.
        Step 1 − Remove root node.
        Step 2 − Move the last element of last level to root.
        Step 3 − Compare the value of this child node with its parent.
        Step 4 − If value of parent is less than child, then swap them.
        Step 5 − Repeat step 3 & 4 until Heap property holds.

        Time
            O(log base 2 of n)

        Heapify
            to correct a heap by bringing the largest node to the root
     */
    // To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Function to delete the root from Heap
    static int deleteRoot(int[] arr, int n) {
        // Get the last element
        int lastElement = arr[n - 1];

        // Replace root with first element
        arr[0] = lastElement;

        // Decrease size of heap by 1
        n = n - 1;

        // heapify the root node
        heapify(arr, n, 0);

        // return new size of Heap
        return n;
    }

    /* A utility function to print array of size N */
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        // Array representation of Max-Heap
        //     10
        //    /  \
        //   5    3
        //  / \
        // 2   4
        int[] arr = { 10, 5, 3, 2, 4 };

        int n = arr.length;

        n = deleteRoot(arr, n);

        printArray(arr, n);
    }
}
