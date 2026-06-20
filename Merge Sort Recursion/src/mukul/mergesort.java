package mukul;

import java.util.Arrays;

public class mergesort {
    static void main() {
        int[] arr={5,4,3,2,1};
        arr = msort(arr);
        System.out.println(Arrays.toString(arr));


    }
     static int[] msort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=msort(Arrays.copyOfRange(arr,0,mid));
        int[] right=msort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix= new int[first.length+ second.length];

        int i=0; // pointet for first
        int j=0; //  pointer for second
        int k=0; // pointer for mix
        while(i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // niche wali chij remaining elements ko copy krne ke liye jisme bhi bch gye
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }
}
