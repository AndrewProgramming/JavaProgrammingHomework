package chapter1;

public class E1_05 {

  public static void main(String[] args) {
    System.out.println("area: " + area(4.5, 7.9));
    System.out.println("perimeter: " + perimeter(4.5, 7.9));
  }

  private static double area(double width, double height) {
    return width * height;
  }

  private static double perimeter(double width, double height) {
    return 2 * (width + height);
  }
}