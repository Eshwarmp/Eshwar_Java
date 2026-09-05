
public class SmallestStableIndex1 {
    public static void main(String[] args) {
        int[] arr = { 5,1,0,4 };
        int k = 3;
        int answer = stable(arr, k);
        System.out.println(answer);
    }

    public static int stable(int[] arr, int k) {
        int n = arr.length;
        int[] suffix = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            suffix[i] = min;
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            int score = max - suffix[i];
            if (score <= k) {
                return i;
            }
        }
        return -1;
    }
}
