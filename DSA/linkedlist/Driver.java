package DSA.linkedlist;

public class Driver {
    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.print();
        System.out.println("-----------");
        linkedList.insertAt(1, 888);
        linkedList.print();

    }
}
