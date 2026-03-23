package mukul;

import java.util.Scanner;

public class HCFLCM {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two nubers");
        System.out.print("a= ");
        int a = in.nextInt();
        System.out.print("b= ");
        int b = in.nextInt();
        System.out.print("the HCF of two numbers is: ");
        System.out.println(hcf(a,b));
        System.out.print("the LCM of two numbers is: ");
        System.out.println(lcm(a,b));

    }
    static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
    static int lcm(int a,int b){
        return a*b/(hcf(a,b));
    }
}
