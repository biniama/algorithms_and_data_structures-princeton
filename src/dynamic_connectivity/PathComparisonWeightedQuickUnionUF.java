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
 *  quick-union                 N              lg* N         lg* N
 *    lg* N means maximum iteration is 5 times since lg* 2^65536 = 5
 * ******************************************************************
 */
public class PathComparisonWeightedQuickUnionUF {

    private int digits[];
    private int weightSize[];   // used to count the number of objects in the tree rooted at i

    public PathComparisonWeightedQuickUnionUF(int n) {

        digits = new int[n];
        weightSize = new int[n];
        init(n);
    }

    // expensive operation
    private void init(int n) {

        for (int i = 0; i < n; i++) {
            digits[i] = i;
            weightSize[i] = 0;
        }
    }

    /**[Difference from WeightedQuickUnion]*/
    // expensive operation
    private int root(int i) {

        while(i != digits[i]) {

            //Simpler one-pass variant
            //make every other node in path point to its grandparent (thereby changing the path length by half)
            digits[i] = digits[digits[i]];

            i = digits[i];
        }
        return i;
    }

    public void union(int p, int q) {

        int i = root(p);
        int j = root(q);

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
