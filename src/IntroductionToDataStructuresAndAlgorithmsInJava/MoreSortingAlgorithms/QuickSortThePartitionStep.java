package IntroductionToDataStructuresAndAlgorithmsInJava.MoreSortingAlgorithms;

import java.util.Arrays;

public class QuickSortThePartitionStep {
    /*
        Partition Step Pseudocode
            Partition(A, start, end)
                pivot = A[end]
                i = start
                for j = start to end end-1
                    if A[j] <= pivot
                        exchange A[i] with A[j]
                        i = i + 1
                    exchange A[i] with A[end]
                    return i
     */

    // Quick Sort Code
    public void sort(Integer[] data) {
        quickSort(data, 0, data.length-1);
    }

    private void quickSort(Integer[] data, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(data, start, end);
            quickSort(data,start,pivotIndex-1);
            quickSort(data, pivotIndex+1, end);
        }
    }

    private int partition(Integer[] data, int start, int end) {
        int pivot = data[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (data[j] < pivot) {
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
                i++;
            }
        }
        data[end] = data[i];
        data[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        Integer[] data = {25,5,7,2,18,23,12,18};
        new QuickSortThePartitionStep().sort(data);
        System.out.println(Arrays.toString(data));
    }

}
