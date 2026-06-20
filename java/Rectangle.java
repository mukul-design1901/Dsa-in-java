class RectangleR {
     
    int length;
    int width;

    RectangleR() {
      System.out.println("normal constructor");
    }

    RectangleR(int length, int width) {
      // parameterized constructor
       this.length = length;
       this.width = width;
    }
   
    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Box extends RectangleR {
    int height;

    Box() {
        System.out.println("normal constructor");
    }
  
    Box(int length, int width, int height) {
        // parameterized constructor
        super(length, width);
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        int height = 10;

        Box box = new Box(length, width, height);

        System.out.println("Area of rectangle: " + box.area());
        System.out.println("Perimeter of rectangle: " + box.perimeter());
        System.out.println("Volume of the box: " + box.volume());
    }
}
