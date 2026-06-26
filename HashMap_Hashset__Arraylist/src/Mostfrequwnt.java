import java.util.HashMap;

public class Mostfrequwnt {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 3, 3, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int mosttimeelement = 0;

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }


            if (map.get(a[i]) > max) {
                max = map.get(a[i]);
                mosttimeelement = a[i];
            }
        }

            System.out.println(mosttimeelement);


        }
    }
