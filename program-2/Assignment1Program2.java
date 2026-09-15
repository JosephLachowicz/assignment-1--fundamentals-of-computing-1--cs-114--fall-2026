import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a base(2 - 9): ");
    String input = scanner.nextLine();
    int x = (int) Math.pow(Integer.parseInt(input), 4) - 1;
  
    System.out.println("The maximum, 4-digit, base 10 number in base " + input + "is: " + x);
    System.out.print("Now, enter a base 10 number in the range 0 to " + x + " to convert: ");
    String input2 = scanner.nextLine();

    int num = 4;
    String answer = "";
    while (num > 0) {
      int remainder = Integer.parseInt(input2) % Integer.parseInt(input);
      int num1 = Integer.parseInt(input2) / Integer.parseInt(input);
      input2 = Integer.toString(num1);
      answer = Integer.toString(remainder);
      --num;
    }
    System.out.print(answer);

  }
}
