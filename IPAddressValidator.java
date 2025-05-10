import java.util.Scanner;

public class IPAddressValidator {
    public static boolean isValidIPWithoutDots(String input) {
        return isValid(input, 0, 0);
    }

    private static boolean isValid(String input, int index, int parts) {
        if (parts == 4 && index == input.length()) return true;
        if (parts == 4 || index == input.length()) return false;

        for (int len = 1; len <= 3 && index + len <= input.length(); len++) {
            String part = input.substring(index, index + len);
            if (part.startsWith("0") && part.length() > 1) continue; // skip leading zero
            int num = Integer.parseInt(part);
            if (num >= 0 && num <= 255) {
                if (isValid(input, index + len, parts + 1)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address without dots (e.g., 19216811): ");
        String userInput = scanner.nextLine();

        if (isValidIPWithoutDots(userInput)) {
            System.out.println("Valid IP address format.");
        } else {
            System.out.println("Invalid IP address format.");
        }

        scanner.close();
    }
}
