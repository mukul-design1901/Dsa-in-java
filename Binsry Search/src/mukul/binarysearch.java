package mukul;

public class binarysearch {
    static void main() {
        int[] nums = {12,14,15,16,28,100};
        int target = 100;
        System.out.println(search(nums,target));

    }
    static int search(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
           // int mid = (start+end)/2; // java me error aa skta hai kyunki agr kbhi integer bda hua end ka to java le hi nhi payega isliye niche ek aur formula hai wo use kro
        int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
       }
        return-1;
    }
}
