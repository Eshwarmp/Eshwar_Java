package Arrays;

public class PeakInMountain {
    public static void main(String[] args) {
        /*
        Mountain Array : The array in which the values initially in ascending order, then in
        descending order. 
        The peak element in Mountain Array is the maximum element.
         */
        int[] arr = { 1, 2, 3, 5, 2, 1 };
        int peakElement = peak(arr);
        System.out.println("The peak element is in index "+peakElement);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // return end because when the loop breaks both pointing towards the same element.
    }
}
