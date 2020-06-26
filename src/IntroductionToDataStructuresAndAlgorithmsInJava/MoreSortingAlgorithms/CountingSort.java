package IntroductionToDataStructuresAndAlgorithmsInJava.MoreSortingAlgorithms;

public class CountingSort {
    /*
        If we have we have more information on the data stored in the array, it helps with making the time linear.

        Counting sort
            a very simple algorithm for data within a reasonable range, ie 0-10, or 0-100

        How it is done
            have an array of any size, but the numbers within are only from 0-10
            make a temp array and then go through the primary array, adding a count to the temp element for each number
            continue till you have read the entire array
            then from that array you can use it to create another array that has the elements sorted

        Time Complexity
            O(n)
            This is determined by the size of the original array and the size of the temp array.
            then the size of the range of the data factors in as well.
            If the sizes though become to large then Counting Sort becomes less usable.

     */
    void sort(char[] arr) {
        int n = arr.length;

        // The output character array that will have sorted arr
        char[] output = new char[n];

        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int[] count = new int[256];
        for (int i=0; i<256; ++i)
            count[i] = 0;

        // store count of each character
        for (char c : arr) ++count[c];

        // Change count[i] so that count[i] now contains actual position of this character in output array
        for (int i=1; i<=255; ++i)
            count[i] += count[i-1];

        // Build the output character array To make it stable we are operating in reverse order.
        for (int i = n-1; i>=0; i--) {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now contains sorted characters
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Driver method
    public static void main(String[] args) {
        CountingSort ob = new CountingSort();
        char[] arr = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'
        };

        ob.sort(arr);

        System.out.print("Sorted character array is ");
        for (char c : arr) System.out.print(c);
    }
}
