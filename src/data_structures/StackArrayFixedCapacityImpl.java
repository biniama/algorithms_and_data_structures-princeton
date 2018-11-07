package data_structures;

 /**
 * Stack LIFO implementation
 * Analysis of Algorithm (lg -> logarithm to the base 2)
 * ******************************************************************
 *  TIME: Every operation takes constant time in the worst case.
 *  SPACE: A stack with N items used ~40N bytes
 * ******************************************************************
 */
public class StackArrayFixedCapacityImpl {

    public static void main(String[] args) {

        StackArrayFixedCapacity stackArrayFixedCapacity = new StackArrayFixedCapacity(5);

        stackArrayFixedCapacity.push("Biniam");
        stackArrayFixedCapacity.push("Asnake");
        stackArrayFixedCapacity.push("Kefale");

        System.out.println(stackArrayFixedCapacity.pop());
        System.out.println(stackArrayFixedCapacity.pop());
        System.out.println(stackArrayFixedCapacity.pop());
        System.out.println("Is Stack empty? " + stackArrayFixedCapacity.isEmpty());
    }
}

class StackArrayFixedCapacity {

    private String[] s;
    private int N;

    public StackArrayFixedCapacity(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String value) {
        s[N++] = value;
        //longer-version s[N] = value && N++;
    }

    public String pop() {
        return s[--N];
        //longer-version return s[N] && N--;
    }
}