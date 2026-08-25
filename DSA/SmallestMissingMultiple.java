

public class SmallestMissingMultiple {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 6, 1 };
        int k = 2;
        int[] sort = sort(arr);
        int answer = ans(sort, k);
        System.out.println(answer);
    }

    public static int ans(int[] arr, int k) {
        int index = 0;
        int i = 1;
        while (index < arr.length) {
            if (k * i == arr[index]) {
                i++;
            }
            index++;
        }
        return k * i;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getMax(int[] arr, int start, int end) {
        int big = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[big]) {
                big = i;
            }
        }
        return big;
    }
}
