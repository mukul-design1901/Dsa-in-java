// Fixed window sum — k=3, har 3 consecutive elements ka sum print karo
public class FixedWindowSum {
    static void main() {
        int[] a = {1, 2, 3, 4, 5};
        int k=3;

        // next apne ko in teen me se bhi bas wo chahiye jo max

        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<=a.length-k;i++) {
            int sum=0;
            for(int j=i;j<i+k;j++) {
                sum += a[j];
            }
            if(sum>maxsum) {
                maxsum=sum;
            }

            System.out.println("window " + (i+1) + ": " + sum);

        }

        System.out.println("Maximum sum among all windows is: " +  maxsum);

    }
}
