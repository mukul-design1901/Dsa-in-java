package mukul;

import java.util.Arrays;

public class nofixed {
    static void main() {
        int[][] arr = {
                {1,2,3,4},
                {1,2},
                {2,3,4}
        };
        for (int row=0;row< arr.length;row++){
           // for (int col=0;col<arr[row].length;col++)
            {
                System.out.println(Arrays.toString(arr[row]));
               // System.out.print(arr[row][col]+ " ");
            }
            // System.out.println();
        }
    }
}
