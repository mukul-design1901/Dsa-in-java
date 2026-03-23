package mukul;

import java.util.Scanner;

public class FactorOfNumber {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int a = in.nextInt();
        factor(a);

    }

    static void factor(int n) {
        if (n <= 0) {
            System.out.println("no factor");
            return;
        }
        // more timr complexity O(n)
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+ " ");
            }
        }
        // time complexity is O(Math.sqrt(n))
     /*   for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               // if (n / i == i) {
                 //   System.out.println(i);
                //} else {
                    System.out.println(i + " " + n/i);
                //}
            }
        }*/
    }
}
