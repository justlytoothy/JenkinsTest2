public class Main {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Incorrect arguments");
    }
    else {
      Calculator calculator = new Calculator();
      switch (args[0])  {
        case "add":
          System.out.println(calculator.add(Integer.parseInt(args[1]),Integer.parseInt(args[2])));
          break;
        case "subtract":
          System.out.println(calculator.subtract(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

          break;
        case "multiply":
          System.out.println(calculator.multiply(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

          break;
        case "divide":
          System.out.println(calculator.divide(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

          break;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(Integer.parseInt(args[1])));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));
          break;
      }
    }
  }
}
