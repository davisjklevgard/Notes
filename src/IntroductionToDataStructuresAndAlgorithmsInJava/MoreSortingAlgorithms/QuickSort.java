package IntroductionToDataStructuresAndAlgorithmsInJava.MoreSortingAlgorithms;

public class QuickSort {
    /*
        Quick Sort Algorithm
            a pretty fast algorithm
            Worst Case though: O(n^2)
            Average: O(nlogn)
            in place sorting
               no extra memory space
               uses an amount of temporary space
                    even if there are thousand temporary variables
               usually does not happen
            Partition Step
                select a number, convention is the last element of the array
                it is then called the pivot element
                then we rearrange the numbers where the smaller numbers are on the left and the larger are on the right
                    these elements might not be sorted

        Quick Sort Pseudocode
            QuickSort(A,start,end)
                if start < end

                pivot = Partition(A, start, end)

                QuickSort(A, start, pivot - 1)
                QuickSort(A, pivot + 1, end)
     */
}
