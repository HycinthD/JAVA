import java.util.Scanner;

public class calculator {

    public static void add(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation;

        while (true) {
            System.out.print("\nEnter operation (add, sub, exit): ");
            operation = input.nextLine();

            System.out.print("Enter num1: ");
            int num1 = input.nextInt();
            System.out.print("Enter num2: ");
            int num2 = input.nextInt();
            input.nextLine(); 


            switch (operation.toLowerCase()) {
                case "add":
                    add(num1, num2);
                    break;
                case "sub":
                    sub(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
