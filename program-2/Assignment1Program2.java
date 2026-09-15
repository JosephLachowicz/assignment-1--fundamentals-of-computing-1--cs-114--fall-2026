import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a base(2 - 9): ");
    String input = scanner.nextLine();

    int x = (int) Math.pow(Integer.parseInt(input), 4) - 1;
    System.out.println(x);

  }
}
