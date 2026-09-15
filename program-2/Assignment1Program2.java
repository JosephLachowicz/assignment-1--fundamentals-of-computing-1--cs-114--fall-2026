import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a base (2 - 9): ");
    String input = scanner.nextLine();
    int x = (int) Math.pow(Integer.parseInt(input), 4) - 1;
  
    System.out.println("The maximum, 4-digit, base 10 number in base " + input + " is: " + x);
    System.out.print("Now, enter a base 10 number in the range 0 to " + x + " to convert: ");
    String input2 = scanner.nextLine();

    int remainder1 = Integer.parseInt(input2) % Integer.parseInt(input);
    int num1 = Integer.parseInt(input2) / Integer.parseInt(input);

    int remainder2 = num1 % Integer.parseInt(input);
    int num2 = num1 / Integer.parseInt(input);

    int remainder3 = num2 % Integer.parseInt(input);
    int num3 = num2 / Integer.parseInt(input);

    int remainder4 = num3 % Integer.parseInt(input);
    int num4 = num3 / Integer.parseInt(input);

    System.out.println(input2 + " (base 10) = " + remainder4 + remainder3 + remainder2 + remainder1 + " (base " + input + ")");

  }
}
