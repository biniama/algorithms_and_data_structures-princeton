package utils;

/**
 * @author Biniam Asnake
 */
public class Printer {

    public static void printArray(Integer[] array) {
        for(Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void printI(Integer data) {
        System.out.println(data);
    }

    public static void printS(String data) {
        System.out.println(data);
    }
}
