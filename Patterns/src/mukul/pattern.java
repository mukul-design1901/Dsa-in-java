package mukul;

import java.util.Scanner;

public class pattern {
    static void main() {
        System.out.println("enter no of rows");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);

    }

      /* static void print(int n){
           for(int i=1;i<=n;i++) {
               for (int j = n; j >= n - i+1; j--) {
                   System.out.print("* ");
               }
               System.out.println();
           }

       }*/
  static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     /* static void print(int n){
          for(int i = 1; i <= n; i++){

              // print spaces
              for(int j = 1; j <= n - i; j++){
                  System.out.print(" ");
              }

              // print stars (no space between them)
              for(int k = 1; k <= i; k++){
                  System.out.print("*");
              }

              System.out.println();
          }
      }*/
   }
  /*  static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/