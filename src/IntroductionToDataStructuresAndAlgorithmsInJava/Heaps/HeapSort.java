package IntroductionToDataStructuresAndAlgorithmsInJava.Heaps;

public class HeapSort {
    /*
        Heap Sort Algorithm
            time: O(nlogn)
            This is used to sort a heap to an ascending order.
            Order of operation:
                1. Build a max heap with input data
                2. largest item is the root, replace with last item, which will reduce the heap by one. Then heapify the
                    heap.
                3. Repeat the steps till the heap is sorted.

     */
    public void sort(int[] arr) {
        int n = arr.length;

        //Build heap (rearrange array)
        for (int i = n/2-1; i >= 0; i--)
            heapify(arr, n, i);

        //One by one extreact an element from heap
        for (int i = n-1; i > 0; i--){
            //Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //call max heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        //see DeletingTheRoot
    }
}
