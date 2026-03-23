package mukul;

import java.util.Scanner;

public class days {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no.of day");
        String Days = in.next();
        switch (Days) {
            case "1" -> System.out.println("monday");
            case "2" -> System.out.println("tuesday");
            case "3" -> System.out.println("wednesday");
            case "4" -> System.out.println("thursday");
            case "5" -> System.out.println("friday");
            case "6" -> System.out.println("saturday");
            case "7" -> System.out.println("sunday");
           default -> System.out.println("enter valid day");



       }
        }
}
