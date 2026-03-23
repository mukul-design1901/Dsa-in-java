package mukul;

public class SearchinginStrings {
    static void main() {
        String name= "Sahil";
        char target = 'u';
        System.out.println(search(name,target));
                    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int index=0; index<str.length();index++){
            if (target== str.charAt(index)){
                return true;
            }
        }
        return false;
    }


}
