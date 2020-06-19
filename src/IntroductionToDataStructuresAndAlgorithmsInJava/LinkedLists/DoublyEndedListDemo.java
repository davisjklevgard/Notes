package IntroductionToDataStructuresAndAlgorithmsInJava.LinkedLists;

public class DoublyEndedListDemo {
    public static void main(String[] args) {
        DoublyEndedLists dList = new DoublyEndedLists();

        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);

        System.out.println(dList);
    }
}
