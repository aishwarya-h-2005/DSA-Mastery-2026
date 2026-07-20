class GFG {

    static void rotate(int[] arr) {

        int n = arr.length;

        reverse(arr, 0, n - 1);
        reverse(arr, 1, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr);
    }
}
