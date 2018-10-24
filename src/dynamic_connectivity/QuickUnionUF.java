package dynamic_connectivity;

/**
 *
 * aka Lazy approach - since it avoids to work on anything until we have to
 *
 * Analysis of Algorithm
 * ******************************************************************
 * * algorithm              * initalize     * union     * find
 * ******************************************************************
 *
 *  quick-union                 N               N           N
 * ******************************************************************
 */
public class QuickUnionUF {

    private int digits[];

    public QuickUnionUF(int n) {

        digits = new int[n];
        init(n);
    }

    // expensive operation
    private void init(int n) {

        for (int i = 0; i < n; i++) {
            digits[i] = i;
        }
    }

    /**[Difference from WeightedQuickUnion]*/
    // expensive operation
    private int root(int i) {

        while(i != digits[i]) {
            i = digits[i];
        }
        return i;
    }

    public void union(int p, int q) {
        digits[p] = root(q);
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }
}
