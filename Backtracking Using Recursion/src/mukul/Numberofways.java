package mukul;

public class Numberofways {
    static void main() {
        System.out.println(ways(3,3));

    }
    static int ways(int row ,int column){
        if (row==1 || column==1){
            return 1;
        }
        int left =ways(row-1,column);
        int right=ways(row,column-1);
        return left+right;

    }
}
