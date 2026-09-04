public class SmallestStableIndex {
    public static void main(String[] args) {
        int[] arr = {3,2,1 };
        int k = 1;
        int answer = solution(arr, k);
        System.out.println(answer);
    }

    public static int solution(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int max = max(arr, 0, i);
            int min = min(arr, i, arr.length - 1);
            int answer = max - min;
            if (answer <= k) {
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] arr, int start, int end) {
        int big = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[big]) {
                big = i;
            }
        }
        return arr[big];
    }

    public static int min(int[] arr, int start, int end) {
        int small = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[small]) {
                small = i;
            }
        }
        return arr[small];
    }
}
