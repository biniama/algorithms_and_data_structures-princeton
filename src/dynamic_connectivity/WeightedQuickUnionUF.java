package dynamic_connectivity;

/**
 *
 * Modification of QuickUnion
 * Assigns weight to the trees
 *  Works by adding the shortest tree to the longest tree
 *
 * Analysis of Algorithm (lg -> logarithm to the base 2)
 * ******************************************************************
 * * algorithm              * initialize     * union     * find
 * ******************************************************************
 *
 *  quick-union                 N              lg N         lg N
 * ******************************************************************
 */
public class WeightedQuickUnionUF {

    private int digits[];

    /**[Difference from WeightedQuickUnion]*/
    private int weightSize[];   // used to count the number of objects in the tree rooted at i

    public WeightedQuickUnionUF(int n) {

        digits = new int[n];
        weightSize = new int[n];
        init(n);
    }

    // expensive operation
    private void init(int n) {

        for (int i = 0; i < n; i++) {
            digits[i] = i;

            /**[Difference from WeightedQuickUnion]*/
            weightSize[i] = 0;
        }
    }

    // expensive operation
    private int root(int i) {

        while(i != digits[i]) {
            i = digits[i];
        }
        return i;
    }

    public void union(int p, int q) {

        int i = root(p);
        int j = root(q);

        /**[Difference from WeightedQuickUnion]*/
        if(weightSize[i] < weightSize[j]) {     // if weight of tree where 'i' belongs is small
            digits[i] = j;                      // assign the root of i to j`s
            weightSize[j] += weightSize[i];     // add the weight of 'i' to 'j'`s
        } else {
            digits[j] = i;
            weightSize[i] += weightSize[j];
        }
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }
}
