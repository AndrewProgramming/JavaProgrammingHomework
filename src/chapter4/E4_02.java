package chapter4;

import java.util.Scanner;
 
public class E4_02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = input.nextDouble();
    double length = input.nextDouble();
 
    double area = areaOfCylinder(radius);
    double volume = volumeOfCylinder(area, length);
 
    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  }
 
  private static double areaOfCylinder(double radius) {
    return radius * radius * Math.PI;
  }
 
  private static double volumeOfCylinder(double area, double length) {
    return area * length;
  }
}