package mukul;

import static java.lang.Integer.MIN_VALUE;

public class Max2DArray {

    static void main() {
        int[][] nums= {
                {2, 3, 4},
                {5, 12,94},
                {1, 6, 7, 8}
        };
        System.out.println(max(nums));

    }
    static int max(int arr[][]) {
        int maxval = arr[0][0];
        for (int rows=0;rows< arr.length;rows++) {
            for (int col = 0; col < arr[rows].length; col++){
                if(arr[rows][col] > maxval){
                    maxval = arr[rows][col];
                }
            }
        }return maxval;

    }
}
