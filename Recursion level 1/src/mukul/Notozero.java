package mukul;

public class Notozero {
    static void main() {
        int n=0;
        System.out.println(steps(n));

    }
    static int steps(int num){
        return helper(num,0);
    }
    static int helper(int num,int steps){
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
