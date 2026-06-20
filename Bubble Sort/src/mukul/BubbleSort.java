package mukul;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] nums = {1,2,3,4,5};
        int ans = bubblesort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static int bubblesort(int arr[]) {
        boolean swapped;
        //for each pass aur each step we use i for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;//for not swapping anything
            //now for element swapping on each step till we get larget value on last index of step respectively
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;//for swapping
                }
            }
            if (!swapped) {
                break;//if there is  no swap in previous step then dont perform nexxt steps as it means the array is sorted}
            }
        }
    return -1;}
}

