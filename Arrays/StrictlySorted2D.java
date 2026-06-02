
import java.util.Arrays;



public class StrictlySorted2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 8;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cEnd) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
    
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns / 2;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, columns - 1, target);
        }

        if(columns == 1){
            while(rStart <= rEnd){
                int mid = rStart + (rEnd-rStart)/2;

                if(matrix[mid][0] == target){
                    return new int[] {mid, 0};
                }

                if(matrix[mid][0] < target){
                    rStart = mid + 1;
                }else{
                    rEnd = mid - 1;
                }
            }
            return new int[] {-1,-1};
        }

        if(columns == 2){
            while(rStart <= rEnd){
                int mid = rStart + (rEnd - rStart) / 2;

                if (matrix[mid][0] == target) {
                    return new int[] { mid, 0 };
                }
                
                if (matrix[mid][1] == target) {
                    return new int[] { mid, 1 };
                }

                if(target < matrix[mid][0]){
                    rEnd = mid - 1;
                }
                else if(target > matrix[mid][1]){
                    rStart = mid + 1;
                }
                else{
                    return new int[] {-1,-1};
                }
            }
            return new int[] {-1,-1};
        }

        

        // run this loop until only 2 rows left
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        
        // now we have only two rows
        if (target == matrix[rStart][cMid]) {
            return new int[] { rStart, cMid };
        }
        if (target == matrix[rStart + 1][cMid]) {
            return new int[] { rStart + 1, cMid };
        }

        // search in first half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        if(target >= matrix[rStart][cMid + 1] && target<= matrix[rStart][columns-1]){
            return binarySearch(matrix, rStart, cMid+1, columns-1, target);
        }
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        else{
            return binarySearch(matrix, rStart + 1, cMid + 1, columns - 1, target);
        }
    }
}
