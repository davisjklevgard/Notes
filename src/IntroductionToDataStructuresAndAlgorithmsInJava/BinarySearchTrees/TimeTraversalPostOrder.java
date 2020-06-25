package IntroductionToDataStructuresAndAlgorithmsInJava.BinarySearchTrees;

public class TimeTraversalPostOrder {
    /*
        Post Order
            1. Traverse the left sub tree
            2. Traverse the right sub tree
            3. Visit the root
        Same with the Pre Order; for large trees, the process will take the leftmost sub tree and move rightward within
        the tree
        this is similar to going to every leaf before going to the parents
     */
   /* private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.printf("%s ", node.data);
    }*/


}
