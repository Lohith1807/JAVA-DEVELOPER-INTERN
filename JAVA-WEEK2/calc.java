import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Simple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            if (option == 5) {
                running = false;
            } else {
                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();
                double result = 0;
                if (option == 1) {
                    result = a + b;
                } else if (option == 2) {
                    result = a - b;
                } else if (option == 3) {
                    result = a * b;
                } else if (option == 4) {
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                } else {
                    System.out.println("Invalid option");
                    continue;
                }
                System.out.println("Result: " + result);
            }
        }
        scanner.close();
        System.out.println("Calculator closed");
    }
}
