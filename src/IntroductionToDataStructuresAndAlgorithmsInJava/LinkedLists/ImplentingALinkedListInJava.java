package IntroductionToDataStructuresAndAlgorithmsInJava.LinkedLists;

public class ImplentingALinkedListInJava<Integer> {
    // A linked list can only need this for the list
    private Node head;

    public void insertAtHead (int data){
        Node newNode = new Node (data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {
        int length = 0;
        Node current = this.head;

        while(current != null) {
            length ++;
            current = current.getNextNode();
        }
        return length;
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
