package mukul;

public class BinarySearch {
    static void main() {
        int[] nums= {2,4,5,9,18,19,21};
        int target= 18;
        System.out.println(search(nums,target,0, nums.length-1));

    }
    static int search(int[] arr, int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (target<arr[mid]){
           return search(arr,target,start,mid-1);
        }
        return search(arr, target, mid+1, end);

    }
}
