class GFG {

    static void min_max_arr(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 1, 9};

        min_max_arr(arr);
    }
}
