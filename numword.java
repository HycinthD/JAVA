public class numword {

    static String numberToWords(int n) {
        String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
        };

        if (n >= 1 && n < 10) {
            return ones[n];
        } else if (n >= 10 && n < 20) {
            return teens[n - 10];
        } else if (n >= 20 && n < 100) {
            return tens[n / 10] + (n % 10 != 0 ? "-" + ones[n % 10] : "");
        } else if (n == 100) {
            return "one hundred";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("Type 1: 1–9");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + numberToWords(i));
        }

        System.out.println("\nType 2: 11–19");
        for (int i = 11; i <= 19; i++) {
            System.out.println(i + ": " + numberToWords(i));
        }

        System.out.println("\nType 3: Multiples of 10");
        for (int i = 10; i <= 100; i += 10) {
            System.out.println(i + ": " + numberToWords(i));
        }

        System.out.println("\nType 4: Compound numbers (21–99, excluding multiples of 10)");
        for (int i = 21; i < 100; i++) {
            if (i % 10 != 0) {
                System.out.println(i + ": " + numberToWords(i));
            }
        }
    }
}
