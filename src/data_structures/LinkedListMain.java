package data_structures;

import java.util.regex.Pattern;

/**
 * @author Biniam Asnake
 */
public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.appendFirst(1);
        linkedList.addNext(2, 1);
        linkedList.addNext(3, 2);
        linkedList.addNext(4, 3);
        linkedList.addNext(5, 4);
        linkedList.appendLast(6);

        System.out.println(linkedList.head);
    }
}

class LinkedList {

    Node head;
    //Node tail;

    LinkedList() {
        this.head = new Node();
        //this.tail = new Node();
    }

    private Node initNode(Integer value) {
        return new Node(value);
    }

    void appendFirst(Integer value) {

        Node node = initNode(value);

        if (head.value == null) {
            head = node;
            head.next = null;
        } else {
            Node previousHead = head;
            head = node;
            head.next = previousHead;
        }
    }

    private Node searchForTail() {

        Node current = head;

        while(current.next != null) {
            current = current.next;
        }

        return current;
    }

    private Node search(Integer value) {

        Node current = head;

        while(current != null) {

            if (current.value == value)
                return current;

            current = current.next;
        }

        return null;
    }

    void appendLast(Integer value) {

        Node node = initNode(value);

        Node tail = searchForTail();
        Node previousTail = tail;

        tail = node;
        previousTail.next = tail;
    }

    void addNext(Integer value, Integer previousNodeValue) {

        Node previousNode = search(previousNodeValue);

        if (previousNode != null) {
            Node node = initNode(value);

            node.next = previousNode.next;
            previousNode.next = node;
        }
    }

    void addBefore(Integer value, Integer nextNodeValue) {

        Node nextNode = search(nextNodeValue);

        if (nextNode != null) {
            Node node = initNode(value);

        }
    }
}

class Node {

    Integer value;

    Node next;

    Node() { }

    Node(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Node(%d, next = %s)", value, next);
    }
}