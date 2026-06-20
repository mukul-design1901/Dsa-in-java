public class MaxSumSubarray {
    static void main() {


        int[] a = {-2,-3,4,-1,-2,1,5,-3};

        // BRUTE FORCE //

//        int maxsum = a[0];
//
//        for (int i = 0; i < a.length; i++) {
//            int currentsum = 0;
//
//            for (int j = i; j < a.length; j++) {
//
//                currentsum += a[j];
//
//                if (currentsum > maxsum) {
//                    maxsum = currentsum;
//                }
//            }
//        }
//
//        System.out.println(maxsum);


        // KADANE'S ALGORITHM //
        int maxsum = a[0];
        int cursum = a[0];
        for (int i = 1; i < a.length; i++) {

            cursum = Math.max(cursum + a[i], a[i]);


            maxsum = Math.max(maxsum, cursum);
        }
        System.out.println(maxsum);
    }
}

