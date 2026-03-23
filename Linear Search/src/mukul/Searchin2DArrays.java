package mukul;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class Searchin2DArrays {
    static void main() {
        int[][] nums= {
                {2,3,4},
                {5,12},
                {1,6,7,8}
        };
        int target = 24;
        int[] ans = search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int arr[][],int target){
        if (arr.length==0){
            return new int[]{-1,-1};
        }

        for (int rows=0;rows< arr.length;rows++){
            for (int col=0;col<arr[rows].length;col++){
                int element = arr[rows][col];
                if(element== target){
                    return new int[]{rows,col};

                }
            }
        }
        return new int[]{-1,-1};

    }
}
