import java.util.HashMap;

public class StringFrequency {
    static void main() {
        String s = "banana";
        HashMap<Character,Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }
            else  {
                freq.put(c,1);
            }
        }
        System.out.println(freq);
    }
}
