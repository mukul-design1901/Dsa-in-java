package mukul;

public class Main {
    static void main() {
        pattern5(5);
    }

    /*  static void pattern1(int n){
          for (int row=1;row<=n;row++){
              // for every row run column
              for (int col=1;col<=row;col++){
                  System.out.print("* ");
              }
              // after every row we need to add new line
              System.out.println();

          }
      } */
  /*  static void pattern2(int n){
        for (int row=1;row<=n;row++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
   /* static void pattern3(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } */
  /*  static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row run column
            for (int j = 1; j <= row; j++) {
                System.out.print(j+" ");
            }
            // after every row we need to add new line
            System.out.println();

        }
    }*/
    static void pattern5(int n){
        int i=1;
        if (i<=n/2){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
        }
    }
}

