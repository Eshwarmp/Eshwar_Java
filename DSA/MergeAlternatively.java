

public class MergeAlternatively {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "pq";
        char[] arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        char[] c = new char[arr.length + b_arr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr.length && j < b_arr.length) {
            c[k] = arr[i];
            i++;
            k++;
            c[k] = b_arr[j];
            j++;
            k++;
        }
        while (i < arr.length) {
            c[k] = arr[i];
            i++;
            k++;
        }
        while (j < b_arr.length) {
            c[k] = b_arr[j];
            j++;
            k++;
        }
        String ans = new String(c);
        System.out.println(ans);
    }
}
