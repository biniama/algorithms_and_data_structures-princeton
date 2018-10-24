public class QuickFind {

    public static void main(String[] args) {

        int n = 10;
        UnionFind uf = new UnionFind(n);

        uf.union(2, 4);
        uf.union(4, 6);
        uf.union(8, 9);
        uf.union(7, 1);
        uf.union(3, 7);

        System.out.println(uf.isConnected(7, 1));
        System.out.println(uf.isConnected(2, 0));
    }
}

class UnionFind {

    private int digits[];

    public UnionFind(int n) {

        digits = new int[n];
        init(n);
    }

    private void init(int n) {

        for(int i = 0; i < n; i++) {
            digits[i] = i;
        }
    }

    public void union(int p, int q) {

        if(!isConnected(p, q)){

            int currentValue = digits[p];

            for(int i = 0; i < digits.length; i++) {

                if(digits[i] == currentValue)
                    digits[i] = digits[q];
            }

        }
    }

    public boolean isConnected(int p, int q) {

        if (digits[p] == digits[q]) {
            return true;
        }

        return false;

        //return();
    }
}
