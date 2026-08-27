public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int answer = index(arr, target);
        System.out.println("The target element is at the index " + answer);
        int isPresent = answer(arr, target, 0);
        System.out.println("The target element is at the index " + isPresent);
    }

    public static int index(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int answer(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return answer(arr, target, index + 1);
    }
}
