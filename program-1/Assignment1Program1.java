import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    
    System.out.println("  JJJJJJJJJJJJJ    LLL       ");
    System.out.println("       JJJ         LLL       ");
    System.out.println("       JJJ         LLL       ");
    System.out.println("       JJJ         LLL       ");
    System.out.println("       JJJ         LLL       ");
    System.out.println("JJJ    JJJ         LLL       ");
    System.out.println(" JJJ   JJJ         LLLLLLLLLL");
    System.out.println("  JJJJJJ           LLLLLLLLLL");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a 5-character string: ");
    String input1 = scanner.nextLine();
    String middle = input1.substring(1, 4);
    String reverse = new StringBuilder(middle).reverse().toString();

    System.out.println("Please enter a number in Fahrenheit: ");
    String input2 = scanner.nextLine();
    String celsius = String.valueOf((Integer.parseInt(input2) - 32) * 5 / 9);

    int randomnum = (int) (Math.random() * 16834) + 32;
    System.out.println("Random number generated. Continuing... ");

    System.out.println("Your new string is: " + celsius + reverse + randomnum);
  }
}
