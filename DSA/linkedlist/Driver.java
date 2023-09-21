package DSA.linkedlist;

public class Driver {
    public static void main(String[] args) {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
//        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}
