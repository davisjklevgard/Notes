package IntroductionToDataStructuresAndAlgorithmsInJava.MoreSortingAlgorithms;

public class BucketSort {
    /*
        Bucket Sort
            useful when the input is uniformly distributed over a range
            works well for integers
        Used
            when used you can sort a group of numbers at a certain position, say the hundreth position.
            Then you will sort any below 100 in the 0 position. after you have sorted the elements in their arrays
            you then can sort within the elements. this can be done as a linked list. After that you can place all the
            elements that are sorted into a new array

        Time Complexity
         Worst case can be O(n)

        Found at https://www.geeksforgeeks.org/bucket-sort-2/
            1. Create n empty buckets (Or lists).
            2. Do following for every array element arr[i].
                Insert arr[i] into bucket[n*array[i]]
            3. Sort individual buckets using insertion sort.
            4. Concatenate all sorted buckets.
     */
}
