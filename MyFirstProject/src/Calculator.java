import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        // Square operation (single number)
        if (choice == 5) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            System.out.println("Result = " + (num * num));
            return;
        }

        // Other operations (multiple numbers)
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.print("Enter number 1: ");
        double result = sc.nextDouble();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();

            result = switch (choice) {
                case 1 -> result + num;
                case 2 -> result - num;
                case 3 -> result * num;
                case 4 -> (num == 0)
                        ? Double.POSITIVE_INFINITY
                        : result / num;
                default -> {
                    System.out.println("Invalid choice");
                    yield result;
                }
            };
        }

        System.out.printf("Result = %.2f",result );
    }
}
