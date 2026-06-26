import java.util.HashMap;

public class hashmapdemo {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple",5);
        map.put("Pineapple",4);
        map.put("Orange",3);
        System.out.println(map.get("Apple"));
        System.out.println(map.get("Pineapple"));
        System.out.println(map.get("Orange"));

        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsKey("Grapes"));

        map.remove("Pineapple");

        System.out.println(map.size());


        for (HashMap.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
    String s = "Programming";
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if (freq.containsKey(c)){
                freq.put(c,freq.get(c)+1); // pehle se hi tha freq wale map me
                // count bdaha rhe hai
            }
            else{
                freq.put(c,1); // pehli baar aya freq wale map me
            }
        }
        System.out.println(freq);

    }
}


