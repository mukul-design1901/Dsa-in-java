package mukul;

public class linearsearch {
    static void main() {
        int[] arr = {5, 6, 10, 19};
        System.out.println(serach(arr,19,0));
    }
    static boolean serach(int[] arr,int target,int index){
        if (index==arr.length-1){
            return true;
        }
        return arr[index] == target || serach(arr,target,index+1);
    }

}
