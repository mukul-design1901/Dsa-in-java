package mukul;

import java.util.Scanner;

public class electricity {
    static void main() {
        double electricitybill =0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no of units utilized");
        double unit = in.nextFloat();
        System.out.println("your electricity bill is:");
if (unit<=100)
{
    electricitybill = unit*1.5;
} else if (unit<=200) {
    electricitybill = 1.5*100 + (unit-100)*2.5;

} else if (unit<=300) {
    electricitybill = 1.5*100 + 2.5*100 + (unit-200)*3.5;

}else {
    electricitybill = 1.5*100 + 2.5*100 + 3.5*100 + (unit-300)*5;

}
        System.out.println(electricitybill);

    }
}
