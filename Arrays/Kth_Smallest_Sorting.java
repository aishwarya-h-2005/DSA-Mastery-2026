import java.util.Arrays;

class GFG {

    static void kth_elem(int[] arr, int k) {

        Arrays.sort(arr);

        System.out.println(arr[k - 1]);
    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        kth_elem(arr, k);
    }
}
