import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle rect1 = new Rectangle(1,2);
    Rectangle rect2 = new Rectangle(1,2);
    System.out.println(rectEqual(rect1, rect2));
    // TODO: Problem 1
    
    // TODO: Problem 2


    // TODO: Problem 3
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    boolean equalL = (r1.getWidth()==r2.getWidth());
    boolean equalW = (r1.getLength()==r2.getLength());

    return (equalL&&equalW);
  }
}
