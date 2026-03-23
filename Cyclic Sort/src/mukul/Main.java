package mukul;

import java.util.Arrays;

//whenever array to sort is given in 1 to N range always use cyclic sort
public class Main {
    static void main() {
        int[] nums = {1,4,6,8,9,5,3,2,7};
        cyclicsort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void cyclicsort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correctindex = arr[i]-1;
            if (arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }
            else {
                i++;
            }
        }
    }
    static int swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    return -1;
    }
}
