import java.util.HashSet;

class GFG {

    static void intersection(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                System.out.print(b[i] + " ");
                set.remove(b[i]);
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {5, 6, 2, 1, 4};
        int[] b = {7, 9, 4, 2};

        intersection(a, b);
    }
}
