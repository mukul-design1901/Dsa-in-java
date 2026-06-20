package mukul;

import java.util.Scanner;

public class inputs {
    private static String system;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter some number:");
        int rollno = input.nextInt();
        System.out.println("your roll no is " + rollno);
    }
}
