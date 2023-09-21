package DSA.linkedlist;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CustomLinkedList<T> {
    Node<T> head;

    private static class Node<T> {
        T value;
        Node<T> next;
    }

    public void insertAll(Collection<T> values) {
        values.forEach(this::insert);
    }

    public int size() {
        int size = 0;
        Node<T> temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtFirst(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
    }

    public void remove(T value) {

        Node<T> temp = head;

        while (temp.next != null) {
            if (temp.next.value == value) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean contains(T value) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }

    public void removeDuplicates() {
        Set<T> duplicates = new HashSet<>();

        Node<T> temp = head;
        duplicates.add(temp.value);
        while (temp.next != null) {

            if (duplicates.contains(temp.next.value)) {
                temp.next = temp.next.next;
            } else {
                duplicates.add(temp.next.value);
                temp = temp.next;
            }

        }

    }

    public void reverse() {
        Node<T> previous = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }
}

