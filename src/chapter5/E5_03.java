package chapter5;

import java.util.Scanner;

public class E5_03 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter today's day: ");
    int day = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int elapsed = input.nextInt();

    String today = getDayName(day);
    String futureDay = getFutureDayName(day, elapsed);

    System.out.println("Today is " + today + " and the future days is " +
        futureDay);
  }

  private static String getFutureDayName(int day, int elapsed) {
    return getDayName((day + elapsed) % 7);
  }

  private static String getDayName(int n) {
    StringBuilder output = new StringBuilder();

    if (n < 0 || n > 6) {
      output.append("Invalid entry. Day of week denoted by integers 0-6.");
    } else {
      switch (n) {
        case 0:
          output.append("Sunday");
          break;
        case 1:
          output.append("Monday");
          break;
        case 2:
          output.append("Tuesday");
          break;
        case 3:
          output.append("Wednesday");
          break;
        case 4:
          output.append("Thursday");
          break;
        case 5:
          output.append("Friday");
          break;
        case 6:
          output.append("Saturday");
          break;
      }
    }

    return output.toString();
  }
}