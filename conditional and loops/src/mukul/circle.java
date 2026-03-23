package mukul;

import java.util.Scanner;

public class circle {
    static void main() {
        float perimeter;
        float area=0;
        float pie = 3.14f;
        System.out.println("enter the value of radius");
        Scanner in = new Scanner(System.in);
        float r = in.nextInt();
        if(r>0)
        {
            perimeter = 2*pie*r;
            area = pie*r*r;
            System.out.println(area);
            System.out.println(perimeter);
        }
        else{
            System.out.println("invalid radius" );
        }

    }
}
