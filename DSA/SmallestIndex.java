public class SmallestIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 2 };
        int ans = answer(arr);
        System.out.println(ans);
    }

    public static int answer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            // int temp = arr[i];
            while (arr[i] > 0) {
                int digit = arr[i] % 10;
                sum += digit;
                arr[i] /= 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}
