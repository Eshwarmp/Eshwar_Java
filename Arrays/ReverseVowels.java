package Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        boolean vowel = isVowel('a');
        System.out.println(vowel);
        reverse(s);
        // System.out.println(s);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
    
    public static void reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (i < j && j < arr.length) {
            if (!isVowel(arr[i])) {
                i++;
            }
            else if (!isVowel(arr[j])) {
                j--;
            }
            else{
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        // System.out.println(Arrays.toString(arr));
        String ss = new String(arr);
        System.out.println(ss);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
