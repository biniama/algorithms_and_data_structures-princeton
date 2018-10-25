package data_structures;

import static utils.Printer.printI;
import static utils.Printer.printS;
import static utils.Printer.printArray;

/*
	Define an array and insert element to an array
	Running time = O(n)
*/
class Array
{
    public static void main (String[] args) throws Exception
    {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printS("Original Array");
        printArray(array);

        printS("Origninal Array Length: ");
        printI(array.length);

        printS("Insert 0 at position 5");
        insertNewElementToArray(array, 5, 0);

        printS("Insert 100 at position 0");
        insertNewElementToArray(array, 0, 100);

        printS("Insert 200 at position 10");
        insertNewElementToArray(array, 10, 200);

        printS("Original Array");
        printArray(array);
    }

    private static void insertNewElementToArray(Integer[] array, Integer position, Integer element) {

        Integer[] newArray = new Integer[array.length + 1];

        printS("New Array Length: ");
        printI(newArray.length);

        newArray[position] = element;

        for(int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        for(int i = position; i < array.length; i++) {
            newArray[i+1] = array[i];
        }

        printArray(newArray);
    }
}
