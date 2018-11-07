package data_structures;

 /**
 * Stack LIFO implementation
 * Analysis of Algorithm (lg -> logarithm to the base 2)
 * ******************************************************************
 *  TIME: Every operation takes constant time in the worst case.
 *  SPACE: A stack with N items used ~40N bytes
 * ******************************************************************
 */
public class StackLinkedListImpl {

    public static void main(String[] args) {

        StackLinkedList stackLinkedList = new StackLinkedList();

        stackLinkedList.push("Biniam");
        stackLinkedList.push("Asnake");
        stackLinkedList.push("Kefale");

        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println("Is Stack empty? " + stackLinkedList.isEmpty());
    }
}

class StackLinkedList {

    Node head = null;

    private class Node {
        String value;
        Node next;

        @Override
        public String toString() {
            return String.format("Node(%d, next = %s)", value, next);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String value) {
        //save the old head
        Node oldHead = head;

        //re-initialize node
        head = new Node();
        //assign or push new value
        head.value = value;
        //set next to the previous/old head
        head.next = oldHead;
    }

    public String pop() {
        //save old value
        String value = head.value;

        //point head to next
        head = head.next;

        //return the value which was added first
        return value;
    }
}