package IntroductionToDataStructuresAndAlgorithmsInJava.Heaps;

public class InsertingAnItemInAHeap {
    /*
        If a level is completely full, then the only place that a new node can be put in at would be the first left of
        the farthest left.

        Fixing the heap:
            However, if a new node is greater than the parent node, the parent and child nodes are
            swapped.This can lead to a case where a new node can end up as the root of the heap
            time: O(log base 2 of n)

       finding the max
            time: O(1)
            max is at the root

        Found at https://www.tutorialspoint.com/data_structures_algorithms/heap_data_structure.htm#:~:text=Max%20Heap%20Deletion%20Algorithm&text=Deletion%20in%20Max%20(or%20Min,child%20node%20with%20its%20parent.
        Step 1 − Create a new node at the end of heap.
        Step 2 − Assign new value to the node.
        Step 3 − Compare the value of this child node with its parent.
        Step 4 − If value of parent is less than child, then swap them.
        Step 5 − Repeat step 3 & 4 until Heap property holds.
     */

    //Found at http://www.algolist.net/Data_structures/Binary_heap/Insertion

   /* public void insert(int value) {

        if (heapSize == data.length)

            throw new HeapException("Heap's underlying storage is overflow");

        else {

            heapSize++;

            data[heapSize - 1] = value;

            siftUp(heapSize - 1);

        }
    }

    private void siftUp(int nodeIndex) {

        int parentIndex, tmp;

        if (nodeIndex != 0) {

            parentIndex = getParentIndex(nodeIndex);

            if (data[parentIndex] > data[nodeIndex]) {

                tmp = data[parentIndex];

                data[parentIndex] = data[nodeIndex];

                data[nodeIndex] = tmp;

                siftUp(parentIndex);

            }

        }

    }*/
}
