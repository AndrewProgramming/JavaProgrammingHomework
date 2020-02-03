package chapter5;

import java.util.Scanner;

public class E3_07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three edges of a triangle: ");
    double e1 = input.nextDouble();
    double e2 = input.nextDouble();
    double e3 = input.nextDouble();

    StringBuilder output = new StringBuilder();
    if (isValidTriangle(e1, e2, e3)) {
      output.append("Perimeter: " + perimeter(e1, e2, e3));
    } else {
      output.append("Edges do not form a triangle.");
    }

    System.out.println(output);
  }

  private static double perimeter(double e1, double e2, double e3) {
    return e1 + e2 + e3;
  }

  private static boolean isValidTriangle(double e1, double e2, double e3) {
    return e1 + e2 > e3 && e2 + e3 > e1 && e3 + e1 > e2;
  }
}