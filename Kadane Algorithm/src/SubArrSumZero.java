public class SubArrSumZero {
    static void main() {
        int[] a = {4,-2,1,-1,3};

        boolean check = false;

        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            if (sum == 0) {
                check = true;
            }

            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];

                if (sum == 0){
                    check = true;
                }
            }
        }
        System.out.println(check);
    }
}
