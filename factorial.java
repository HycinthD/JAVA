import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
    Scanner factor = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = factor.nextInt();

    int fact = 1;

    for(int i = 1; i <= num; i++)
    {
        fact = fact * i;
    }
    System.out.println("Factorial of the number :"+ num +" is " + fact);
}
}
