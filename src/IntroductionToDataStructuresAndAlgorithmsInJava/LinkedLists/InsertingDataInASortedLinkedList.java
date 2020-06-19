package IntroductionToDataStructuresAndAlgorithmsInJava.LinkedLists;

public class InsertingDataInASortedLinkedList {
    /*
        So if there is nothing in the l;ist at the start, the new node will go to the head of the list
        second case will be if there is already a sorted and the node is less than the Head node, meaning that the new
        node is a number smaller than the head and will then have it's reference point to the head and replace it as the
        new head.
        The third case is that there is a sorted list and the new node is greater than the head but less than the nodes
        later in the list. You will have to go through each node one-by-one and compare it to the new node. But if yu do
        that, you cannot go back to the node that is before the greater than node.  How you are able to fix this is to
        compare the current node's reference to the new node.

        But if there is no greater than node. the new node is added at the end of the list

        Worse case time: O(n)
     */
}
