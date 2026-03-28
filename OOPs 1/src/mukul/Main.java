package mukul;

public class Main {
     void main() {
      /*  int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        Student[] students = new Student[5];*/


        Student Mukul = new Student();//19,"Mukul",78.3f);

       // Mukul.rollno=19;
       // Mukul.name="Mukul Chittora";
        //Mukul.marks=78.5f;

      //   Mukul.changeName("Car Paglu");
       //  Mukul.greeting();

      System.out.println(Mukul.rollno);
        System.out.println(Mukul.name);
        System.out.println(Mukul.marks);
    }
    class Student{
        int rollno;
        String name;
        float marks;

      /*  void greeting() {
            System.out.println("Hello My Name is " + name);
        }

        void changeName(String newname){
            name=newname;
        }*/

        Student() {
            this.rollno=13;
            this.name="Kunal";
            this.marks=92.6f;
        }

        Student(int rollno,String name,float marks) {
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }
    }
}
