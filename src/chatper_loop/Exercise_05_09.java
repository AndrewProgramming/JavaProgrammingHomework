package chatper_loop;

public class Exercise_05_09 {

  public static void main(String[] args) {
    int n = 0;  // Start n at 0

    // Find the smallest n such that n^2 > 12,000
    while (Math.pow(n, 2) < 12000) {
      n++;    // Increment n
    }

    // Display result
    System.out.println(
        "The smallest integer n such that n^2 is greater than 12,000: " + n);
  }
}