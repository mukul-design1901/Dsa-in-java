package mukul;

import java.util.Arrays;
import java.util.Scanner;

public class multiarray {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        //input
        for (int row=0; row< arr.length;row++){
            for(int col=0; col< arr[row].length;col++) {
                arr[row][col] = in.nextInt();
            }
            }
        //output
        for (int row=0; row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}
