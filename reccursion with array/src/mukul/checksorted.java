package mukul;

public class checksorted {
    static void main() {
        int[] nums={1,10,3,4,5};
        System.out.println(sorted(nums,0));

    }

  /*  static void sorted(int[] arr) {
        for (int i = 1; i<arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                System.out.println("not sorted");
                return;
            }
                System.out.println("sorted");
            }
        }*/
    static boolean sorted(int[] arr, int index){
        // base condition
        if(index== arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
    }
