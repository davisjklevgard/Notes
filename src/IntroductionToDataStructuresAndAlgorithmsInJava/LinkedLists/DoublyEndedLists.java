package IntroductionToDataStructuresAndAlgorithmsInJava.LinkedLists;

public class DoublyEndedLists {
    /*
        Doubly Ended Lists
            Has two ends: a head and a tail
            this list can reference both ends
            so you can add and delete from both ends
            not commonly used
        Tail
            refers to the last element of the linked list

     */

    private Node head;
    private Node tail;

    public void insertAtTail (int data) {

        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail != null)
            this.tail.setNextNode(newNode);
            this.tail = newNode;
    }
    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";

        return result;
    }
}
