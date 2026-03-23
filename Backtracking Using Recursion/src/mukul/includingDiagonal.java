package mukul;

import java.util.ArrayList;

public class includingDiagonal {
    static void main() {
        System.out.println(ways(3,3));
        System.out.println(pathret("",3,3)) ;

    }
    static ArrayList<String> pathret(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1 && c>1){
            list.addAll(pathret(p+"d",r-1,c-1));
        }
        if (r>1){
            list.addAll(pathret(p+"D",r-1,c));
        }
        if (c>1){
            list.addAll(pathret(p+"R",r,c-1));
        }
        return list;
    }
    static int ways(int row ,int column){
        if (row==1 || column==1){
            return 1;
        }
       /* if (row>1 && column>1){
            return 1;
        }*/ // wrong
        int middle  =ways(row-1,column-1);
        int down =ways(row-1,column);
        int right=ways(row,column-1);
        return middle+down+right;

    }
}
