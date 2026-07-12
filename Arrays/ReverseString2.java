package Arrays;

public class ReverseString2 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/reverse-string-ii/description/

        String a = "abcd";
        int k = 4;
        char[] ar  = a.toCharArray();
        int i = 0;
        int j = Math.min(i + k - 1, ar.length - 1);
        while (i < j && j < ar.length) {
            reverse(ar, i, j);
            i = i + 2 * k;
            j = Math.min(i + k - 1, ar.length - 1);
        }
        String ans = new String(ar);
        System.out.println(ans);
    }

    public static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
