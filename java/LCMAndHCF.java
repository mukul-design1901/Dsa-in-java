import java.util.Scanner;

public class LCMAndHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
       
        int[] numbers = new int[n];
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
     
        int lcm = findLCM(numbers);
        System.out.println("LCM of the given numbers is: " + lcm);
        
   
        int hcf = findHCF(numbers);
        System.out.println("HCF of the given numbers is: " + hcf);

        sc.close();
    }

 
    public static int findLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = lcm(numbers[i], lcm);
        }
        return lcm;
    }

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static int findHCF(int[] numbers) {
        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = hcf(numbers[i], hcf);
        }
        return hcf;
    }

    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
}

