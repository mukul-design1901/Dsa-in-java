package mukul;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        //Scanner in = new Scanner(System.in);
        // System.out.print("enter the no: ");
      //  int a= in.nextInt();
      //  int no = 33;
       //prime(a);
        int a=40;
        for (int i=1;i<=a;i++){// to print no in a given range if prime or not
          //  System.out.println(i+ " " + prime(i));
            if (prime(i)==false){// print only those no. which are prime
                System.out.println(i+ " " + prime(i));
            }
        }

        }
    static boolean prime(int n) {
        if (n <= 1) {
          //  System.out.println("not prime");
            return false;
        }
      //  boolean isprime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
               // isprime = false;
                return false;
               // break;
            }
        }

       // if (true) {
          //  System.out.println("prime");
       // } else {
        //    System.out.println("not prime");

        return true;
    }

    }

