package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3,4 };
        int target = 6;
        int i = 0;
        int j = arr.length-1;
        int sum = 0;
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum > target) {
                j--;
            }
            else if (sum < target) {
                i++;
            }
            else {
                System.out.println((i + 1) + " " + (j + 1));
                break;
            }
        }
    }
}
