package IntroductionToDataStructuresAndAlgorithmsInJava.BinarySearchTrees;

public class DeletingAnItemCase3 {
    /*
        This case is one where there are two child nodes
        This is rather complicated
        all that is needed to be done is to replace the parent node with the right child
        you make the reference point to the right child and also make the left child of the parent to be the left child
        of the right node.

        Now for nodes that have children that have children of their own is a different matter
        For this you would go down the right subtree and then go to the first left child. That child will be what is
        called a Successor
        Successor: a node in the right subtree that is on the left that is a leaf and will be used to replace the node
        that is to be deleted.
        you will have the successor replace the current node and have the left child of the current node become the left
        child of teh successor. Then the right child of the current node becomes the right of the successor. The connection
        between the parent and successor is broken, replaced by a connection to the root node.
        If there is a right child for the successor, then that right child will be the left child of the parent of the
        successor
     */
}
