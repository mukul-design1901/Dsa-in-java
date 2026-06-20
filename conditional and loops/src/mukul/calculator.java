package mukul;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class calculator {
    static void main() {
        Scanner in = new Scanner(System.in);
                //take input from user till user does not press x or X
                int ans = 0;
                while(true) {
                    System.out.println("enter the operator:");
                    int op = in.next().trim().charAt(0);
                    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                        System.out.println("enter two numbers:");
                        int num1 = in.nextInt();
                        int num2 = in.nextInt();

                        if (op == '+') {
                            ans = num1 + num2;
                        }
                        if (op == '-') {
                            ans = num1 - num2;
                        }
                        if(op== '*')
                        {
                            ans = num1 * num2;
                        }
                        if(op== '/')
                            if(num2 !=0)
                            {
                                ans = num1/num2;
                            }
                        if(op== '%')
                        {
                            ans= num1%num2;
                        }
                            System.out.println(ans);
                        }
                    else {
                        System.out.println("invalid operator");
                    }

                }
    }
}
