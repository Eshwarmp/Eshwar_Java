public class KthLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 5 };
        int k = 2;
        int kthLarg = kthLarge(arr, k);
        System.out.println(kthLarg);
    }

    static int kthLarge(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
        return arr[arr.length - k];
    }
    
    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
