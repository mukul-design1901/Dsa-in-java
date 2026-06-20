package mukul;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] nums={12,5,4,65,89,74};
        insertion(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void insertion(int[] arr){
        for (int i=0;i<= arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j-1]>arr[j]){
                    //swap(arr,j,j-1);
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else {
                    break;
                }
            }

        }

    }
     /*static int swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    return -1;} */
}

