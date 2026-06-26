import java.util.HashSet;

public class ArrayUniqueElement {
    static void main() {
        int[] arr = {1,2,2,3,1,4};
        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
