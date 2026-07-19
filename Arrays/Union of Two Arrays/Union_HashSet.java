import java.util.HashSet;

class GFG {

    static void union(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        union(a, b);
    }
}
