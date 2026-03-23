package mukul;

import javax.swing.*;

// average salary excluding maximum and minimum salary
public class question {
    static void main() {
        int[] nums={10000,20000,30000,45000,50000};
        sort(nums);
        double avg=average(nums);
        System.out.println(avg);

    }
    static int sort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for (int j=i+1;j>0;j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                }
            else{
                break;
                }
            }
        }
    return-1;}
    static int average(int[] arr){
        int sum=0;
        for(int i=1;i< arr.length-1;i++){
            sum+=arr[i];
        }
        return(int) sum/(arr.length-2);
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
