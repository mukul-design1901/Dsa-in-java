import java.util.HashSet;
public class demo_hashset {
    static void main() {
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);

        System.out.println(set);
        System.out.println(set.size());

        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(3));


        // letsbuse it for checking duplicate in array
        int[] arr = {1,2,3,6,3};
        boolean hasduplicate = false;

        HashSet<Integer> seen = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                hasduplicate = true;
                break;
        }
        else{
            seen.add(arr[i]);
        }
    }
        System.out.println(hasduplicate);
        System.out.println(seen);
}
}