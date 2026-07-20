class GFG {

    static void min_max_prod(int[] arr) {

        int max_produ = arr[0];
        int min_produ = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = max_produ;
                max_produ = min_produ;
                min_produ = temp;
            }

            max_produ = Math.max(arr[i], arr[i] * max_produ);
            min_produ = Math.min(arr[i], arr[i] * min_produ);

            ans = Math.max(ans, max_produ);
        }

        System.out.print(ans);
    }

    public static void main(String[] args) {

        int[] arr = {-2, 6, -3, -10, 0, 2};

        min_max_prod(arr);
    }
}
