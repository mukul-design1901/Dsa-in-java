package mukul;

import java.util.Arrays;

public class kth {
        static void main() {
            int[] arr={4,5,2,1,0};
           int result= kMax(arr,2);
            System.out.println(result);

        }
        static int kMax(int[] nums,int k){
            bubblesort(nums);
            return nums[nums.length-k];

        }
        static int bubblesort(int[] arr){
            boolean swapped;
            for (int i=0;i<arr.length;i++){
                swapped = false;
                for (int j=1;j<arr.length-i;j++){
                    if(arr[j-1]>arr[j]){
                        swap(arr,j-1,j);
                        swapped=true;
                    }
                }
                if (!swapped){
                    break;
                }
            }
            return -1;
        }
        static void swap(int[] arr,int first,int second){
            int temp=arr[second];
            arr[second]=arr[first];
            arr[first]=temp;
        }
    }

