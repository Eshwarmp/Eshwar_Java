package Arrays;

public class evenDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 10, 50, 198 };
        int even=0;
        for (int n : arr) {
            int count = (int) (Math.log10(n)+1); // Alternative way
            if (count % 2 == 0) {
                even++;
            }
        }
        System.out.println("The number of elements containing even number of digits is "+ even);
        int noOfEvenDigits = evenNoDigits(arr);
        System.out.println("The number of  elements containing even number of digits is "+ noOfEvenDigits);
    }

    static int evenNoDigits(int[] arr) {
        int even = 0;
        for (int num : arr) {
            
            int count = 0;
            while (num > 0) {
                int digit = num % 10;
                count++;
                num /= 10;
            }
            if (count % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
