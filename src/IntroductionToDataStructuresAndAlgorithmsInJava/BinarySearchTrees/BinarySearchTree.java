package IntroductionToDataStructuresAndAlgorithmsInJava.BinarySearchTrees;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {
    private TreeNode root;

   /* public void insert(Integer data){
        if (root == null)
            this.root = new TreeNode(data);
        else root.insert(data);
    }*/

    public TreeNode find(Integer data) {

       // if (root != null)
       //     return root.find(data);

        return null;
    }

    public void delete(Integer data) {
        TreeNode toDel = find(data);
        //toDel.delete();
    }

    /*public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;


        if (current == null)
            return;

        while (current != null && current.getData() != data) {
            parent = current;

            if (data < current.getData()) {
                current+ current.getLeftChild();
                isLeftChild = true;
            }else {
                current = current.getrightChild();
                isLeftChild = false;
            }
        }

        if (current == null)
            return;

        if ((current.getLeftChild() == null && current.getRightChild() == null){
            if (current == root) {
                root = null;
            }else {
                if (isLeftChild)
                    parent.setLeftChild(null);
                else
                    parent.setRightChild(null);
            }
        }
        //this is for |Case 2
        //this part is for left child
        else if (current.getRightChild() == null) {
            if (current == root)
                root == current.getLeftChild();
            }else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            }  else {
                parent.setRightChild(current.getLeftChild());
            }
        }
        else if (current.getRightChild() == null) {
            if (current == root)
                root == current.getRightChild();
            }else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            }  else {
                parent.setRightChild(current.getRightChild());
            }
        }
    }*/

}
