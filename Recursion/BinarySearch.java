package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 3;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target,int start, int end){
            int mid = start + (end - start) / 2;
            
            if (start > end) {
                return -1;
            }
        
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, target, start, mid - 1);
            }
            
            return binarySearch(arr, target, mid+1, end);
            
        
            

    }
}
