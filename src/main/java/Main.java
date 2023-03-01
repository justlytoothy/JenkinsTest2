import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command: ");
    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("exit")) {
      input = scanner.nextLine();
      System.out.println(doStuff(input.split(" ")));
    }
  }
  private static String doStuff(String[] args) {
    Calculator calculator = new Calculator();
    switch (args[0])  {
      case "add":
        return String.valueOf(calculator.add(Integer.parseInt(args[1]),Integer.parseInt(args[2])));
      case "subtract":
        return String.valueOf(calculator.subtract(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

      case "multiply":
        return String.valueOf(calculator.multiply(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

      case "divide":
        return String.valueOf(calculator.divide(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

      case "binary":
        return calculator.intToBinaryNumber(Integer.parseInt(args[1]));
      case "fibonacci":
        return String.valueOf(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));
    }
    return "";
  }
}
