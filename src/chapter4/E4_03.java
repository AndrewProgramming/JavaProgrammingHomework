package chapter4;

import java.util.Scanner;
 
public class E4_03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    double feet = input.nextDouble();
 
    double meters = feetToMeters(feet);
 
    System.out.println(feet + " feet is " + meters + " meters");
  }
 
  private static double feetToMeters(double feet) {
    return feet * 0.305;
  }
}