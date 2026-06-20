package mukul;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int a= 2;
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int no = input.nextInt();
        if (no%a==0)
            System.out.println("the no is even");
        else
            System.out.println("the no is odd");


    }
}
