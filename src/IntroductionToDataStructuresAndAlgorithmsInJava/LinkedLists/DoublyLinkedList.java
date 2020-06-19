package IntroductionToDataStructuresAndAlgorithmsInJava.LinkedLists;

class DoublyLinkedList2 {
    /*
        Doubly linked Node:
            this node holds its data, points a reference to the next node, AND holds a reference to the previous node.
            You can move forward and backward in this kind of list then

        Inserting a new node:
            there are three things that you need to do to insert a new node.
                one is to make sure that the new node points to the current head of the list
                then make sure that the head node points back to the new node
                finally make sure that the head of the list points to the new node.
     */
    //switched with node
    private int data;
    private DoublyLinkedList nextNode;
    private DoublyLinkedList previousNode;

    public void DoublyLinkedList3 (int data) {
        this.data =data;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedList nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedList getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedList previousNode) {
        this.previousNode = previousNode;
    }
}
