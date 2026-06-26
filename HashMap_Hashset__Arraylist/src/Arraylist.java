import java.util.ArrayList;
public class Arraylist {
    static void main() {


        ArrayList<Integer> list = new ArrayList<>();

// Add karo
        list.add(10);
        list.add(20);
        list.add(30);


// Get karo — arr[i] ki jagah .get(i)
        System.out.println(list.get(0));  // 10

// Size — arr.length ki jagah .size()
        System.out.println(list.size());  // 3

// Remove karo
        list.remove(1);  // index 1 remove → {10, 30}

// Update karo
        list.set(0, 99); // index 0 pe 99 rakho → {99, 30}

// Contains check
        list.contains(30);  // true

// TRAVERSING ARRAYLIST
    list.add(30);
    list.add(30);
    list.add(5);

    for (int i=0;i<list.size();i++) {
        System.out.print(list.get(i) + " ");
    }
        System.out.println();
    //for each elemnt
        for (int num:list){
            System.out.print(num + " ");
        }

    }
}