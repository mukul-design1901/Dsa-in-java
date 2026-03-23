package mukul;

import java.util.ArrayList;

public class SubSeq {
    static void main() {
      //  subseq("","abc");
        System.out.println(subseqRet("","abc"));

    }
    // By Recursion
    static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }
    // To Return an ArrayList
    static ArrayList<String> subseqRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left =subseqRet(p+ch,up.substring(1));
        ArrayList<String> right= subseqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
