package mukul;

public class main {
    static void main() {
int[] nums = {12,34,56,78,9,10};
int target = 100;
int ans = linearsearch(nums,target);
        System.out.print(ans);
    }
    static int linearsearch(int arr[], int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int index=0 ;index< arr.length;index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        } return -1;
    }



}
