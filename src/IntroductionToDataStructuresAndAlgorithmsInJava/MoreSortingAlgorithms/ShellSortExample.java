package IntroductionToDataStructuresAndAlgorithmsInJava.MoreSortingAlgorithms;



public class ShellSortExample {
    /*
        Insertion sort's time complexity is improved in the shell sort around O(n^(7/6)) - O(n^(3/2)) by Robert Lafore
     */


    //An utility function to print array of size n
    public static void printArray(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    //function to sort arr using Shell Sort
    void sort(int[] arr) {
        int n = arr.length;

        //Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //Do a gaped insertion sort for this gap size. The first gap elements a[)..gap-1} are already in gaped order
            //keep adding one more element until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap sorted save a[i] in temp and make a hole at position i
                int temp = arr[i];

                //shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                //put temp (the original a[i]) in its correct location
                arr[j] = temp;

            }
        }
    }

        //Driver method
        public static void main(String[] args){
            System.out.println("Array before sorting");
            int[] arr = {12, 34, 54, 2, 3};
            printArray(arr);

            ShellSortExample ob = new ShellSortExample();
            ob.sort(arr);

            System.out.println("Array after sorting");
            printArray(arr);
        }
}


