package mukul;

import java.util.Scanner;

public class SquareRoot {
    static void main() {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the number: ");
        float a = in.nextFloat();
      //  float a =50;
        sqroot(a);

    }
    static void sqroot(float n){
      //  boolean no =true;
        if(n<=0) {
         //   no=false;
            System.out.println("square root not possible");
            return;
        }
      /* if (no) {
            for (float i = 1; i <= n; i++) {
                if (i * i == n) {
                    System.out.println(i);
                    break;
                }
            }
        }*/
        double result= Math.sqrt(n);
        System.out.println("the sq. root is:" +result);
    }
}
