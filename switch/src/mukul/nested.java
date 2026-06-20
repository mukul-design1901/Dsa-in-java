package mukul;

import java.util.Scanner;

public class nested {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter employee id");
        int emp_id = in.nextInt();
        String department = in.next();
        switch(emp_id){
            case 1:
                System.out.println("rahul");
                break;
            case 2:
                System.out.println("mukul");
                break;
            case 3:
                System.out.println("employee no. 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("CSE department");
                        break;
                }break;
            default:
                System.out.println("enter valid employee id");
        }

    }
}
