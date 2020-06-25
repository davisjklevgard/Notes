package IntroductionToDataStructuresAndAlgorithmsInJava.BinarySearchTrees;

public class TreeTraversalInOrder {
    /*
        One of the things that may need to be done is to go through all the nodes in a binary tree. There are three ways
        to do it
        In Order: easiest  and most commonly used way
        Pre Order: required for a compiled kind of program
        Post Order: same requirement for pre order.

        In Order
            1. travers the left sub tree
            2. Visit the root
            3. Traverse the right sub tree
        So if it is a large binary tree, the search will first go through the leftmost tree and then the left-right tree
        and follow the order as shown above.

     */
    /*private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.printf("%s ", node.data);
        inOrder(node.right);
    }*/
}
