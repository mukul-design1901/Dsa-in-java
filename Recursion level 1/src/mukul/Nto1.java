package mukul;

import java.util.Scanner;

public class Nto1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no of terms: ");
        int n = in.nextInt();
        print(n);

    }
    static void print(int n){
        if (n==0){
            return;
        }
        System.out.print(n+ " ");
        print(n-1);
        }
}
