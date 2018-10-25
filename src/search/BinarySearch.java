package search;

/**
 * ****************************************
 *      Binary Search
 *  Running time:        log N
 * ****************************************
 *
 * @author Biniam Asnake
 */
public class BinarySearch {

    public static void main(String[] args) {

        int digits[] = {6, 11, 20, 33, 42, 51, 64, 78, 85, 99};

        int value = 33;
        System.out.println(binarySearch(digits, value));
    }

    private static int binarySearch(int[] digits, int value) {

        int lowerIndex = 0;
        int higherIndex = digits.length - 1;

        while (lowerIndex != higherIndex) {

            int medianIndex = (lowerIndex + higherIndex) / 2;

            if (value < digits[medianIndex]) {
                higherIndex = medianIndex - 1;
            } else if (value > digits[medianIndex]){
                lowerIndex = medianIndex + 1;
            } else {
                return medianIndex;
            }
        }

        return -1;
    }
}
