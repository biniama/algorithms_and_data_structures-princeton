package dynamic_connectivity;

/**
 * It takes N^2 (quadratic time) and it is very expensive.
 *
 * aka Eager Approach
 *
 * * Analysis of Algorithm
 * ******************************************************************
 * * algorithm              * initalize     * union     * find
 * ******************************************************************
 *
 *  quick-find                 N               N           1
 * ******************************************************************

 */
public class QuickFindUF {

    private int digits[];

    public QuickFindUF(int n) {

        digits = new int[n];
        init(n);
    }

    // expensive operation
    private void init(int n) {

        for(int i = 0; i < n; i++) {
            digits[i] = i;
        }
    }

    public void union(int p, int q) {

        if(!isConnected(p, q)){

            int currentValue = digits[p];

            // expensive operation
            for(int i = 0; i < digits.length; i++) {

                if(digits[i] == currentValue)
                    digits[i] = digits[q];
            }

        }
    }

    // cheap operation
    public boolean isConnected(int p, int q) {

        return digits[p] == digits[q];
    }
}
