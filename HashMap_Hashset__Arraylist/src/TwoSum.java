import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 15, 6, 3};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];


            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " " + i);
                return;
            }


            map.put(arr[i], i);
        }

        System.out.println("No pair found.");
    }
}