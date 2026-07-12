package Arrays;

public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'i') {
                sb.append(arr[i]);
            } else {
                sb.reverse();
            }
        }
        System.out.println(sb);
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
