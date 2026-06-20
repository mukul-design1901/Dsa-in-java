package mukul;

import java.util.Scanner;

public class average {
    static void main() {
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("total numbers:");
        int N = in.nextInt();
        System.out.println("enter the values of numbers");
        for(int i =0;i<N;i++)
        {
            sum+= in.nextDouble();
        }
        double average = sum/N;
        System.out.println("the average is:"+average);




    }
}
