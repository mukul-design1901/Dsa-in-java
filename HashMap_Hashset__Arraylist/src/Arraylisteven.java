import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraylisteven {
  public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();

            if (arr[i]%2==0){
                list.add(arr[i]);
            }
        }
            System.out.println(Arrays.toString(arr));

      System.out.println(list);

    }
}
