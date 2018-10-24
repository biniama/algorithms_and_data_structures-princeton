package dynamic_connectivity;

public class UnionFindMain {

    public static void main(String[] args) {

        int n = 10;

        callQuickFind(n);

        callQuickUnion(n);

        callWeightedQuickUnion(n);

        callWeightedPathComparisonQuickUnion(n);
    }

    private static void callQuickFind(int n) {
        QuickFindUF qf = new QuickFindUF(n);

        qf.union(2, 4);
        qf.union(4, 6);
        qf.union(8, 9);
        qf.union(7, 1);
        qf.union(3, 7);

        System.out.println("[QuickFindUF] " + qf.isConnected(7, 1));
        System.out.println("[QuickFindUF] " + qf.isConnected(2, 0));
    }

    private static void callQuickUnion(int n) {
        QuickUnionUF qu = new QuickUnionUF(n);

        qu.union(2, 4);
        qu.union(4, 6);
        qu.union(8, 9);
        qu.union(7, 1);
        qu.union(3, 7);

        System.out.println("[QuickUnionUF] " + qu.isConnected(7, 1));
        System.out.println("[QuickUnionUF] " + qu.isConnected(2, 0));
    }

    private static void callWeightedQuickUnion(int n) {
        WeightedQuickUnionUF wqu = new WeightedQuickUnionUF(n);

        wqu.union(2, 4);
        wqu.union(4, 6);
        wqu.union(8, 9);
        wqu.union(7, 1);
        wqu.union(3, 7);

        System.out.println("[WeightedQuickUnionUF] " + wqu.isConnected(7, 1));
        System.out.println("[WeightedQuickUnionUF] " + wqu.isConnected(2, 0));
    }

    private static void callWeightedPathComparisonQuickUnion(int n) {
        PathComparisonWeightedQuickUnionUF pcwqu = new PathComparisonWeightedQuickUnionUF(n);

        pcwqu.union(2, 4);
        pcwqu.union(4, 6);
        pcwqu.union(8, 9);
        pcwqu.union(7, 1);
        pcwqu.union(3, 7);

        System.out.println("[PathComparisonWeightedQuickUnionUF] " + pcwqu.isConnected(7, 1));
        System.out.println("[PathComparisonWeightedQuickUnionUF] " + pcwqu.isConnected(2, 0));
    }
}
