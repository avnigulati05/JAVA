package inheritance;

public class Square extends Rectangle {
     void print () {
            System.out.println("Square is  a Rectange ");
        }

    public static void main (String [] args) {
           Square square = new Square();
           square.printrectangle();
          square.printshape();
    }
}