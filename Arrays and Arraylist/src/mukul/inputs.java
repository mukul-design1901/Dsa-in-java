package mukul;

import java.util.Arrays;
import java.util.Scanner;

public class inputs {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
      /*  arr[0]=23;
        arr[1]=223;
        arr[2]=253;
        arr[3]=237;
        arr[4]=923;
        System.out.println(arr[2]); */


        //input using for loops
        for (int i = 0; i < 5; i++) {

            arr[i] = in.nextInt(); //used for taking input
        }
        System.out.println("array according to your input");
      /*  for (int i = 0; i < 5; i++) {
            System.out.print( arr[i] + " ");  // used to print what input we have given in above for loop
        }*/

            System.out.println(Arrays.toString(arr));



    }
}


