import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle rect1 = new Rectangle(1,2);
    Rectangle rect2 = new Rectangle(1,2);
    System.out.println(rectEqual(rect1, rect2));

    Scanner sc = new Scanner(System.in);
    // TODO: Problem 1
    System.out.println("Enter two integers: ");
    int numerator = sc.nextInt();
    int denominator = sc.nextInt();
    if (denominator != 0){
      if (numerator/denominator >= 1 && numerator/denominator <= 8){
        System.out.println("Ratio OK");
      }
    } else {
      System.out.println("Divide by 0 error");
    }
    // TODO: Problem 2
    System.out.println("Enter two integers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (b != 0){
      if (a%b == 0){
        System.out.println("Is a factor");
      }
    } else {
      System.out.println("Divide by 0 error");
    }

    // TODO: Problem 3
    System.out.println("Enter an integer: ");
    int numInput = sc.nextInt();
    if (numInput < 50 || numInput > 59){
      System.out.println("Input outside of range");
      numInput = 55;
    }

    // Problem 4
    System.out.println("Enter two integers x and y: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x <= 9 || (x > 2 && x*y > 10)){
      System.out.println("pass");
    }
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
