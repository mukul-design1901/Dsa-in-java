import java.util.Arrays;

public class bubble {
    static void main() {
        int nums[] = {1,5,10,22,16};
        sort(nums);
        int max= nums[nums.length-1];
        int min=nums[0];
        System.out.println("the maximum no is: " +max);
        System.out.println("the minimum no is: " +min);
        //System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(nums));
    }
    static int sort(int[] arr){
        boolean swapped;
        for(int i=0;i< arr.length;i++){
            swapped=false;
            for (int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return 0;
    }
}


