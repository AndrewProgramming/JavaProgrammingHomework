package chapter5;

import java.util.Scanner;

public class E5_06 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String guess;
    do {
      System.out.print("Enter 'h' (heads) or 't' (tails): ");
      guess = input.nextLine().toLowerCase();
    } while (!guess.equals("h") && !guess.equals("t"));

    String flip = sideName(flipCoin());
    System.out.println("Flip: " + flip);
    StringBuilder output = new StringBuilder();
    if (guess.equals(flip.charAt(0) + "")) {
      output.append("You guessed correctly!");
    } else {
      output.append("You guessed wrong!");
    }

    System.out.println(output);
  }

  private static int flipCoin() {
    return (int) (Math.random() * 2);
  }

  private static String sideName(int s) {
    return s == 0 ? "heads" : "tails";
  }
}