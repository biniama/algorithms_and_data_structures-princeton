public class UnionFindMain {

    public static void main(String[] args) {

        int n = 10;
        QuickFindUF qf = new QuickFindUF(n);

        qf.union(2, 4);
        qf.union(4, 6);
        qf.union(8, 9);
        qf.union(7, 1);
        qf.union(3, 7);

        System.out.println(qf.isConnected(7, 1));
        System.out.println(qf.isConnected(2, 0));
    }
}
