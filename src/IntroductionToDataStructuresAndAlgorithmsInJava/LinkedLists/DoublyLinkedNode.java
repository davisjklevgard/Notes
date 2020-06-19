package IntroductionToDataStructuresAndAlgorithmsInJava.LinkedLists;
//switched with the list
public class DoublyLinkedList {

    private DoublyLinkedList head;

    public DoublyLinkedList(Integer data) {

    }

    public DoublyLinkedList getHead() {
        return this.head;
    }

    protected void setHead(DoublyLinkedList head) {
        this.head = head;
    }

    public boolean isHead(DoublyLinkedList node) {
        return this.head == node;
    }

    public void insertAtHead(Integer data) {
        DoublyLinkedList newNode = new DoublyLinkedList(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    private void setPreviousNode(DoublyLinkedList newNode) {
    }

    private void setNextNode(DoublyLinkedList head) {
    }

    public int length() {
        if (head == null)
            return 0;
        int length = 0;
        DoublyLinkedList curr = this.head;
        while (curr != null) {
            length += 1;
            curr.getNextNode();
        }
        return length;
    }

    private void getNextNode() {
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedList n = this.head;
        while (n != null) {
            sb.append("Node data: ");
            sb.append(n);
            sb.append("\n");
            n.getNextNode();
        }
        return sb.toString();
    }
}

